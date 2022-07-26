package ar.com.matiasgaleano.Portfolio.service;

import ar.com.matiasgaleano.Portfolio.model.HardSkill;
import ar.com.matiasgaleano.Portfolio.repository.HardSkillRepository;
import ar.com.matiasgaleano.Portfolio.service.interfaces.IHardSkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardSkillService implements IHardSkillService {

  
  @Autowired
  public HardSkillRepository skillRepo;
          
  @Override
  public List<HardSkill> getSkillList() {
    return skillRepo.findAll();
  }

  @Override
  public HardSkill getSkill(Long id) {
    return skillRepo.findById(id).orElse(null);
  }

  @Override
  public void addSkill(HardSkill skill) {
    skillRepo.save(skill);
  }

  @Override
  public void editSkill(HardSkill skill) {
    skillRepo.save(skill);
  }

  @Override
  public void deleteSkill(Long id) {
    skillRepo.deleteById(id);
  }
  
}
