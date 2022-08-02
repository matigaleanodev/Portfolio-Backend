package ar.com.matiasgaleano.Portfolio.service.interfaces;

import ar.com.matiasgaleano.Portfolio.model.Perfil;
import java.util.List;

public interface IProfileService {
  
  public List<Perfil> getProfile();
  
  public void postProfile(Perfil prof);
  
  public void editProfile(Perfil prof);
  
  public void deleteProfile(Long id);
  
}
