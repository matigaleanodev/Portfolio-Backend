package ar.com.matiasgaleano.Portfolio.service.interfaces;

import ar.com.matiasgaleano.Portfolio.model.Profile;
import java.util.List;


public interface IProfileDataService {
  
  public List<Profile> getProfiles();
  
  public void addProfile(Profile data);
  
  public void editProfile(Profile data);
  
  public void deleteProfile(Long id);
  
}
