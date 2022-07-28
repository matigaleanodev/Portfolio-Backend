package ar.com.matiasgaleano.Portfolio.controller;

import ar.com.matiasgaleano.Portfolio.model.Contact;
import ar.com.matiasgaleano.Portfolio.service.interfaces.IContactService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/contact")
public class ContactController {
  
  @Autowired
  private IContactService contactServ;
  
  @GetMapping
  public ResponseEntity<List<Contact>> getContactList(){
    return new ResponseEntity(contactServ.getContactList(), HttpStatus.OK);
  }
  
  @GetMapping("/{id}")
  public ResponseEntity<Contact> getContact(@PathVariable Long id){
    return new ResponseEntity(contactServ.getContact(id), HttpStatus.OK);
  }
  
  @PostMapping
  public ResponseEntity<?> addContact(@RequestBody Contact data){
    contactServ.addContact(data);
    return new ResponseEntity(new Message("Mensaje Agregado"), HttpStatus.OK);
  }
  
  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteContact(@PathVariable Long id){
    contactServ.deleteContact(id);
    return new ResponseEntity(new Message("Mensaje borrado"), HttpStatus.OK);
  }
  
}
