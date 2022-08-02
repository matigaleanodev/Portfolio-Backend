package ar.com.matiasgaleano.Portfolio.service;

import ar.com.matiasgaleano.Portfolio.model.ProfileData;
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
  public List<ProfileData> getProfiles() {
    return dataRepo.findAll();
  }

  @Override
  public void addProfile(ProfileData data) {
    dataRepo.save(data);
  }

  @Override
  public void editProfile(ProfileData data) {
    dataRepo.save(data);
  }

  @Override
  public void deleteProfile(Long id) {
    dataRepo.deleteById(id);
  }
  
}
