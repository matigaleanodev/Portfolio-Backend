package ar.com.matiasgaleano.Portfolio.controller;

import ar.com.matiasgaleano.Portfolio.model.ProfileData;
import ar.com.matiasgaleano.Portfolio.service.interfaces.IProfileDataService;
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
public class ProfileDataController {
  
  @Autowired
  private IProfileDataService dataServ;
  
  @GetMapping("/profile")
  public ResponseEntity<List<ProfileData>> getProfile() {
    return new ResponseEntity(dataServ.getProfiles(), HttpStatus.OK);
  }

  @PostMapping("/profile")
  public ResponseEntity<?> postProfile(ProfileData prof) {
    dataServ.addProfile(prof);
    return new ResponseEntity(new Message("Perfil Creado"), HttpStatus.OK);
  }

  @PutMapping("/profile")
  public ResponseEntity<?> editProfile(ProfileData prof) {
    dataServ.editProfile(prof);
    return new ResponseEntity(new Message("Perfil Editado"), HttpStatus.OK);
  }
  
  @DeleteMapping("/profile/{id}")
  public ResponseEntity<?> deleteProfile(@PathVariable Long id) {
    dataServ.deleteProfile(id);
    return new ResponseEntity(new Message("Perfil borrado"), HttpStatus.OK);
  }
  
}
