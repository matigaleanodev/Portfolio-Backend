package ar.com.matiasgaleano.Portfolio.service;

import ar.com.matiasgaleano.Portfolio.service.interfaces.IWorkService;
import ar.com.matiasgaleano.Portfolio.model.Work;
import ar.com.matiasgaleano.Portfolio.repository.WorkRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkService implements IWorkService {

  @Autowired
  public WorkRepository workRepo;

  @Override
  public List<Work> getWorkList() {
    return workRepo.findAll();
  }

  @Override
  public Work getWork(Long id) {
    return workRepo.findById(id).orElse(null);
  }

  @Override
  public void addWork(Work work) {
    workRepo.save(work);
  }

  @Override
  public void editWork(Work work) {
    workRepo.save(work);
  }

  @Override
  public void deleteWork(Long id) {
    workRepo.deleteById(id);
  }

}
