package ar.com.matiasgaleano.Portfolio.service.interfaces;

import ar.com.matiasgaleano.Portfolio.model.ProfileData;
import java.util.List;


public interface IProfileDataService {
  
  public List<ProfileData> getProfiles();
  
  public void addProfile(ProfileData data);
  
  public void editProfile(ProfileData data);
  
  public void deleteProfile(Long id);
  
}
