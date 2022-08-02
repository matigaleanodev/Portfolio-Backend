package ar.com.matiasgaleano.Portfolio.controller;

import ar.com.matiasgaleano.Portfolio.model.HardSkill;
import ar.com.matiasgaleano.Portfolio.model.SoftSkill;
import ar.com.matiasgaleano.Portfolio.service.interfaces.IHardSkillService;
import ar.com.matiasgaleano.Portfolio.service.interfaces.ISoftSkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SkillsController {

  @Autowired
  private IHardSkillService hSkillServ;

  @Autowired
  private ISoftSkillService sSkillServ;

  @GetMapping("/hardskill")
  public ResponseEntity<List<HardSkill>> getHSkills() {
    return new ResponseEntity(hSkillServ.getSkillList(), HttpStatus.OK);
  }

  @GetMapping("/hardskill/{id}")
  public ResponseEntity<HardSkill> getHSkill(@PathVariable Long id) {
    return new ResponseEntity(hSkillServ.getSkill(id), HttpStatus.OK);
  }

  @PostMapping("/hardskill")
  public ResponseEntity<?> addHSkill(@RequestBody HardSkill data) {
    hSkillServ.addSkill(data);
    return new ResponseEntity(new Message("Skill Agregada"), HttpStatus.OK);
  }

  @PutMapping("/hardskill")
  public ResponseEntity<List<HardSkill>> editHSkills(@RequestBody HardSkill data) {
    hSkillServ.editSkill(data);
    return new ResponseEntity(new Message("Skill editada"), HttpStatus.OK);
  }

  @DeleteMapping("/hardskill/{id}")
  public ResponseEntity<?> deleteHSkill(@PathVariable Long id) {
    hSkillServ.deleteSkill(id);
    return new ResponseEntity(new Message("Skill Borrada"), HttpStatus.OK);
  }

  @GetMapping("/softskill")
  public ResponseEntity<List<SoftSkill>> getSSkills() {
    return new ResponseEntity(sSkillServ.getSkillList(), HttpStatus.OK);
  }

  @GetMapping("/softskill/{id}")
  public ResponseEntity<SoftSkill> getSSkill(@PathVariable Long id) {
    return new ResponseEntity(sSkillServ.getSkill(id), HttpStatus.OK);
  }

  @PostMapping("/softskill")
  public ResponseEntity<?> addSSkill(@RequestBody SoftSkill data) {
    sSkillServ.addSkill(data);
    return new ResponseEntity(new Message("Skill Agregada"), HttpStatus.OK);
  }

  @PutMapping("/softskill")
  public ResponseEntity<List<HardSkill>> editSSkills(@RequestBody SoftSkill data) {
    sSkillServ.editSkill(data);
    return new ResponseEntity(new Message("Skill editada"), HttpStatus.OK);
  }

  @DeleteMapping("/softskill/{id}")
  public ResponseEntity<?> deleteSSkill(@PathVariable Long id) {
    sSkillServ.deleteSkill(id);
    return new ResponseEntity(new Message("Skill Borrada"), HttpStatus.OK);
  }
  
}
