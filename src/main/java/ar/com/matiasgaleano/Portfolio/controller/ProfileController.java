package ar.com.matiasgaleano.Portfolio.controller;

import ar.com.matiasgaleano.Portfolio.model.Perfil;
import ar.com.matiasgaleano.Portfolio.service.interfaces.IProfileService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProfileController {

  @Autowired
  private IProfileService profServ;

  @GetMapping("/profile")
  public ResponseEntity<List<Perfil>> getProfile() {
    return new ResponseEntity(profServ.getProfile(), HttpStatus.OK);
  }

  @PostMapping("/profile")
  public ResponseEntity<?> postProfile(Perfil prof) {
    profServ.postProfile(prof);
    return new ResponseEntity(new Message("Perfil Creado"), HttpStatus.OK);
  }

  @PutMapping("/profile")
  public ResponseEntity<?> editProfile(Perfil prof) {
    profServ.editProfile(prof);
    return new ResponseEntity(new Message("Perfil Editado"), HttpStatus.OK);
  }
  
  @DeleteMapping("/profile/{id}")
  public ResponseEntity<?> deleteWork(@PathVariable Long id) {
    profServ.deleteProfile(id);
    return new ResponseEntity(new Message("Perfil borrado"), HttpStatus.OK);
  }

}
