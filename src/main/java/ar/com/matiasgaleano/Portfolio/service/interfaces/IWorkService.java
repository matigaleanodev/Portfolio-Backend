package ar.com.matiasgaleano.Portfolio.service.interfaces;

import ar.com.matiasgaleano.Portfolio.model.Work;
import java.util.List;

public interface IWorkService {

  public List<Work> getWorkList();

  public Work getWork(Long id);

  public void addWork(Work work);

  public void editWork(Work work);

  public void deleteWork(Long id);

}
