package ar.com.matiasgaleano.Portfolio.service;

import ar.com.matiasgaleano.Portfolio.service.interfaces.IProjectService;
import ar.com.matiasgaleano.Portfolio.model.Project;
import ar.com.matiasgaleano.Portfolio.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService {

  @Autowired
  public ProjectRepository projRepo;

  @Override
  public List<Project> getProjectList() {
    return projRepo.findAll();
  }

  @Override
  public Project getProject(Long id) {
    return projRepo.findById(id).orElse(null);
  }

  @Override
  public void addProject(Project proj) {
    projRepo.save(proj);
  }

  @Override
  public void editProject(Project proj) {
    projRepo.save(proj);
  }

  @Override
  public void deleteProject(Long id) {
    projRepo.deleteById(id);
  }

}
