package ar.com.matiasgaleano.Portfolio.security.controller;

import ar.com.matiasgaleano.Portfolio.security.model.JwtUser;
import ar.com.matiasgaleano.Portfolio.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

  @Autowired
  private UserRepository userRepo;

  @Autowired
  private BCryptPasswordEncoder bCryptPasswordEncoder;


  @PostMapping("/signup")
  public void signUp(@RequestBody JwtUser user) {
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    userRepo.save(user);  
  }
}
