package ar.com.matiasgaleano.Portfolio.service;

import ar.com.matiasgaleano.Portfolio.service.interfaces.IProfileService;
import ar.com.matiasgaleano.Portfolio.model.Profile;
import ar.com.matiasgaleano.Portfolio.repository.ProfileRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService implements IProfileService {
  
  @Autowired
  public ProfileRepository profRepo;

  @Override
  public List<Profile> getProfile() {
    return profRepo.findAll();
  }

  @Override
  public void postProfile(Profile prof) {
    profRepo.save(prof);
  }

  @Override
  public void editProfile(Profile prof) {
    profRepo.save(prof);
  }
  
}
