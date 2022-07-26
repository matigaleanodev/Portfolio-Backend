package ar.com.matiasgaleano.Portfolio.service;

import ar.com.matiasgaleano.Portfolio.model.Contact;
import ar.com.matiasgaleano.Portfolio.repository.ContactRepository;
import ar.com.matiasgaleano.Portfolio.service.interfaces.IContactService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService implements IContactService {
  
  @Autowired
  private ContactRepository contactRepo;

  @Override
  public List<Contact> getContactList() {
    return contactRepo.findAll();
  }

  @Override
  public Contact getContact(Long id) {
    return contactRepo.findById(id).orElse(null);
  }

  @Override
  public void addContact(Contact data) {
    contactRepo.save(data);
  }

  @Override
  public void deleteContact(Long id) {
    contactRepo.deleteById(id);
  }
  
}
