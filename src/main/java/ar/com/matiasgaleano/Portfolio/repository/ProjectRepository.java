package ar.com.matiasgaleano.Portfolio.repository;

import ar.com.matiasgaleano.Portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
