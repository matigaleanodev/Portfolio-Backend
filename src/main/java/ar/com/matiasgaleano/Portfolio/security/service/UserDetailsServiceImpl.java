package ar.com.matiasgaleano.Portfolio.security.service;

import ar.com.matiasgaleano.Portfolio.security.model.JwtUser;
import ar.com.matiasgaleano.Portfolio.security.repository.UserRepository;
import static java.util.Collections.emptyList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
  
  @Autowired
  private UserRepository userRepo;
  
   @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        JwtUser user = userRepo.findByUsername(s);
        return new User(user.getUsername(), user.getPassword(), emptyList());
    }


}
