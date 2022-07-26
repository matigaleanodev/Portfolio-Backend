package ar.com.matiasgaleano.Portfolio.service.interfaces;

import ar.com.matiasgaleano.Portfolio.model.Project;
import java.util.List;

public interface IProjectService {

  public List<Project> getProjectList();

  public Project getProject(Long id);

  public void addProject(Project proj);

  public void editProject(Project proj);

  public void deleteProject(Long id);

}
