package ar.com.matiasgaleano.Portfolio.service;

import ar.com.matiasgaleano.Portfolio.model.Profile;
import ar.com.matiasgaleano.Portfolio.repository.ProfileDataRepository;
import ar.com.matiasgaleano.Portfolio.service.interfaces.IProfileDataService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileDataService implements IProfileDataService {
  
  @Autowired
  ProfileDataRepository dataRepo;

  @Override
  public List<Profile> getProfiles() {
    return dataRepo.findAll();
  }

  @Override
  public void addProfile(Profile data) {
    dataRepo.save(data);
  }

  @Override
  public void editProfile(Profile data) {
    dataRepo.save(data);
  }

  @Override
  public void deleteProfile(Long id) {
    dataRepo.deleteById(id);
  }
  
}
