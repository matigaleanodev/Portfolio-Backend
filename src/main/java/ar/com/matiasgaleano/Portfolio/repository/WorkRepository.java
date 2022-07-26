package ar.com.matiasgaleano.Portfolio.repository;

import ar.com.matiasgaleano.Portfolio.model.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends JpaRepository<Work, Long> {

}
