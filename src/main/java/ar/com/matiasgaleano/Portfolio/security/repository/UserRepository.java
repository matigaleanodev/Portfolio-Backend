package ar.com.matiasgaleano.Portfolio.security.repository;

import ar.com.matiasgaleano.Portfolio.security.model.JwtUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<JwtUser, Long>{
  public JwtUser findByUsername(String username);
}
