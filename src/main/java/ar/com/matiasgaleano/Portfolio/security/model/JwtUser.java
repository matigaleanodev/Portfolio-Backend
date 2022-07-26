package ar.com.matiasgaleano.Portfolio.security.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class JwtUser {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull(message = "username obligatorio")
  private String username;

  @NotNull(message = "password obligatorio")
  private String password;  
   
  public JwtUser() {
  }

  public JwtUser(Long id, String username, String password) {
    this.id = id;
    this.username = username;
    this.password = password;
  }
  
  
  
}

