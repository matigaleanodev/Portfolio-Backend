package ar.com.matiasgaleano.Portfolio.service;

import ar.com.matiasgaleano.Portfolio.model.Profile;
import ar.com.matiasgaleano.Portfolio.repository.ProfileRepo;
import ar.com.matiasgaleano.Portfolio.service.interfaces.IProfileService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService implements IProfileService {
  
  @Autowired
  ProfileRepo profRepo;

  @Override
  public List<Profile> getProfile() {
    return profRepo.findAll();
  }

  @Override
  public void addProfile(Profile prof) {
    profRepo.save(prof);
  }

  @Override
  public void editProfile(Profile prof) {
    profRepo.save(prof);
  }

  @Override
  public void deleteProfile(Long id) {
    profRepo.deleteById(id);
  }
  
}
