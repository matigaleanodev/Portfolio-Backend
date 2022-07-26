package ar.com.matiasgaleano.Portfolio.service.interfaces;

import ar.com.matiasgaleano.Portfolio.model.Contact;
import java.util.List;

public interface IContactService {

  public List<Contact> getContactList();

  public Contact getContact(Long id);

  public void addContact(Contact data);

  public void deleteContact(Long id);

}
