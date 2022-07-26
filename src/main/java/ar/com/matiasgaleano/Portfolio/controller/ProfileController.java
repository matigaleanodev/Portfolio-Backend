package ar.com.matiasgaleano.Portfolio.controller;

import ar.com.matiasgaleano.Portfolio.model.Profile;
import ar.com.matiasgaleano.Portfolio.service.interfaces.IProfileService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ProfileController {
  
  @Autowired
  private IProfileService profServ;
  
  @GetMapping("/profile")
  public ResponseEntity<List<Profile>> getProfile(){
    return new ResponseEntity(profServ.getProfile(), HttpStatus.OK);
  }
  
  @PostMapping("/profile")
  public ResponseEntity<?> postProfile(Profile prof){
    profServ.postProfile(prof);
    return new ResponseEntity(new Message("Perfil Creado"), HttpStatus.OK);
  }
  
  @PutMapping("/profile")
  public ResponseEntity<?> editProfile(Profile prof){
    profServ.editProfile(prof);
    return new ResponseEntity(new Message("Perfil Editado"), HttpStatus.OK);
  } 
  
}

