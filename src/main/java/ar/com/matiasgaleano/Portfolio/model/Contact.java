package ar.com.matiasgaleano.Portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Contact {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String mail;
  @Column(columnDefinition="TEXT")
  private String message;

  public Contact() {
  }

  public Contact(Long id, String name, String mail, String message) {
    this.id = id;
    this.name = name;
    this.mail = mail;
    this.message = message;
  }

}
