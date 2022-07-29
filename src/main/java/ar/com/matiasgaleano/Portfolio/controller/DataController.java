package ar.com.matiasgaleano.Portfolio.controller;

import ar.com.matiasgaleano.Portfolio.model.Education;
import ar.com.matiasgaleano.Portfolio.model.HardSkill;
import ar.com.matiasgaleano.Portfolio.model.Project;
import ar.com.matiasgaleano.Portfolio.model.SoftSkill;
import ar.com.matiasgaleano.Portfolio.model.Work;
import ar.com.matiasgaleano.Portfolio.service.interfaces.IEducationService;
import ar.com.matiasgaleano.Portfolio.service.interfaces.IHardSkillService;
import ar.com.matiasgaleano.Portfolio.service.interfaces.IImageService;
import ar.com.matiasgaleano.Portfolio.service.interfaces.IProjectService;
import ar.com.matiasgaleano.Portfolio.service.interfaces.ISoftSkillService;
import ar.com.matiasgaleano.Portfolio.service.interfaces.IWorkService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class DataController {
  
  @Autowired
  private IImageService imgServ;

  @Autowired
  private IWorkService workServ;
  
  @Autowired
  private IEducationService educServ;
  
  @Autowired
  private IProjectService projServ;
  
  @Autowired
  private IHardSkillService hSkillServ;
  
  @Autowired
  private ISoftSkillService sSkillServ;
  
  
  
  @PostMapping("/image")
  @CrossOrigin(origins = "*")
  public ResponseEntity<?> addImage(@RequestParam("file") MultipartFile image) {
    imgServ.saveImage(image);
    return new ResponseEntity(new Message("Imagen Guardada"), HttpStatus.OK);
  }

  @GetMapping(path = {"/image/{name}"})
  public ResponseEntity<byte[]> loadImage(@PathVariable("name") String name) {
    return imgServ.loadImage(name);
  }

  @DeleteMapping(path = {"/image/{name}"})
  public ResponseEntity<?> deleteImage(@PathVariable("name") String name) {
    imgServ.deleteImage(name);
    return new ResponseEntity(new Message("Imagen Borrada"), HttpStatus.OK);
  }  

  @GetMapping("/work")
  public ResponseEntity<List<Work>> getWorkList() {
    return new ResponseEntity(workServ.getWorkList(), HttpStatus.OK);
  }

  @GetMapping("/work/{id}")
  public ResponseEntity<Work> getWork(@PathVariable Long id) {
    return new ResponseEntity(workServ.getWork(id), HttpStatus.OK);
  }

  @PostMapping("/work")
  @CrossOrigin(origins = "*")
  public ResponseEntity<?> addWork(@RequestBody Work data) {
    workServ.addWork(data);
    return new ResponseEntity(new Message("Trabajo Agregado"), HttpStatus.OK);

  }

  @PutMapping("/work")
  public ResponseEntity<?> editWork(@RequestBody Work data) {
    workServ.editWork(data);
     return new ResponseEntity(new Message("Trabajo actualizado"), HttpStatus.OK);
  }

  @DeleteMapping("work/{id}")
  public ResponseEntity<?> deleteWork(@PathVariable Long id) {
    workServ.deleteWork(id);
    return new ResponseEntity(new Message("Trabajo borrado"), HttpStatus.OK);
  }
  
  @GetMapping("/education")
  public ResponseEntity<List<Education>> getEducationList() {
    return new ResponseEntity(educServ.getEducationList(), HttpStatus.OK);
  }

  @GetMapping("/education/{id}")
  public ResponseEntity<Education> getEducation(@PathVariable Long id) {
    return new ResponseEntity(educServ.getEducation(id), HttpStatus.OK);
  }

  @PostMapping("/education")
  public ResponseEntity<?> addEducation(@RequestBody Education data) {
    educServ.addEducation(data);
    return new ResponseEntity(new Message("Educacion Agregada"), HttpStatus.OK);
  }

  @PutMapping("/education")
  public ResponseEntity<?> editEducation(@RequestBody Education data) {
    educServ.editEducation(data);
    return new ResponseEntity(new Message("Educacion Editada"), HttpStatus.OK);
  }

  @DeleteMapping("/education/{id}")
  public ResponseEntity<?> deleteEducation(@PathVariable Long id) {
    educServ.deleteEducation(id);
    return new ResponseEntity(new Message("Educacion Borrada"), HttpStatus.OK);
  }
  
  @GetMapping("/project")
  public ResponseEntity<List<Project>> getProjecs() {
    return new ResponseEntity(projServ.getProjectList(), HttpStatus.OK);    
  }

  @GetMapping("/project/{id}")
  public ResponseEntity<Project> getProjec(@PathVariable Long id) {
    return new ResponseEntity(projServ.getProject(id), HttpStatus.OK);
  }

  @PostMapping("/project")
  public ResponseEntity<?> addProject(@RequestBody Project data) {
    projServ.addProject(data);
    return new ResponseEntity(new Message("Proyecto Agregado"), HttpStatus.OK);
  }

  @PutMapping("/project")
  public ResponseEntity<?> editProject(@RequestBody Project data) {
    projServ.editProject(data);
    return new ResponseEntity(new Message("Proyecto Editado"), HttpStatus.OK);
  }

  @DeleteMapping("/project/{id}")
  public ResponseEntity<?> deleteProject(@PathVariable Long id) {
    projServ.deleteProject(id);
    return new ResponseEntity(new Message("Proyecto Borrado"), HttpStatus.OK);
  }
  
  @GetMapping("/hardskill")
  public ResponseEntity<List<HardSkill>> getHSkills(){
    return new ResponseEntity(hSkillServ.getSkillList(), HttpStatus.OK);
  }
  
  @GetMapping("/hardskill/{id}")
  public ResponseEntity<HardSkill> getHSkill(@PathVariable Long id){
    return new ResponseEntity(hSkillServ.getSkill(id), HttpStatus.OK);
  }
  
  @PostMapping("/hardskill")
  public ResponseEntity<?> addHSkill(@RequestBody HardSkill data) {
    hSkillServ.addSkill(data);
    return new ResponseEntity(new Message("Skill Agregada"), HttpStatus.OK);
  }
  
  @PutMapping("/hardskill")
  public ResponseEntity<List<HardSkill>> editHSkills(@RequestBody HardSkill data){
    hSkillServ.editSkill(data);
    return new ResponseEntity(new Message("Skill editada"), HttpStatus.OK);
  }
  
  @DeleteMapping("/hardskill/{id}")
  public ResponseEntity<?> deleteHSkill(@PathVariable Long id) {
    hSkillServ.deleteSkill(id);
    return new ResponseEntity(new Message("Skill Borrada"), HttpStatus.OK);
  }
  
  @GetMapping("/softskill")
  public ResponseEntity<List<SoftSkill>> getSSkills(){
    return new ResponseEntity(sSkillServ.getSkillList(), HttpStatus.OK);
  }
  
  @GetMapping("/softskill/{id}")
  public ResponseEntity<SoftSkill> getSSkill(@PathVariable Long id){
    return new ResponseEntity(sSkillServ.getSkill(id), HttpStatus.OK);
  }
  
  @PostMapping("/softskill")
  public ResponseEntity<?> addSSkill(@RequestBody SoftSkill data) {
    sSkillServ.addSkill(data);
    return new ResponseEntity(new Message("Skill Agregada"), HttpStatus.OK);
  }
  
  @PutMapping("/softskill")
  public ResponseEntity<List<HardSkill>> editSSkills(@RequestBody SoftSkill data){
    sSkillServ.editSkill(data);
    return new ResponseEntity(new Message("Skill editada"), HttpStatus.OK);
  }
  
  @DeleteMapping("/softskill/{id}")
  public ResponseEntity<?> deleteSSkill(@PathVariable Long id) {
    sSkillServ.deleteSkill(id);
    return new ResponseEntity(new Message("Skill Borrada"), HttpStatus.OK);
  }

}
