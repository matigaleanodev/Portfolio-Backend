package ar.com.matiasgaleano.Portfolio.service.interfaces;

import ar.com.matiasgaleano.Portfolio.model.Profile;
import java.util.List;

public interface IProfileService {
  
  public List<Profile> getProfile();
  
  public void addProfile(Profile prof);
  
  public void editProfile(Profile prof);
  
  public void deleteProfile(Long id);
  
}
