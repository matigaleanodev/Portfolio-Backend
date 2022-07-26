package ar.com.matiasgaleano.Portfolio.service;

import ar.com.matiasgaleano.Portfolio.service.interfaces.IEducationService;
import ar.com.matiasgaleano.Portfolio.model.Education;
import ar.com.matiasgaleano.Portfolio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EducationService implements IEducationService {

  @Autowired
  public EducationRepository educRepo;

  @Override
  public List<Education> getEducationList() {
    return educRepo.findAll();
  }

  @Override
  public Education getEducation(Long id) {
    return educRepo.findById(id).orElse(null);
  }

  @Override
  public void addEducation(Education educ) {
    educRepo.save(educ);
  }

  @Override
  public void editEducation(Education educ) {
    educRepo.save(educ);
  }

  @Override
  public void deleteEducation(Long id) {
    educRepo.deleteById(id);
  }

}
