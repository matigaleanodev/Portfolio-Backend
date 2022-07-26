package ar.com.matiasgaleano.Portfolio.repository;

import ar.com.matiasgaleano.Portfolio.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
  
}
