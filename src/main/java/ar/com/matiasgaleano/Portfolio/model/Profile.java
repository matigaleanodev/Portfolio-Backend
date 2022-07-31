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
public class Profile {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String image;
  @Column(columnDefinition="TEXT")
  private String description;

  public Profile() {
  }

  public Profile(Long id, String name, String image, String description) {
    this.id = id;
    this.name = name;
    this.image = image;
    this.description = description;
  }

}
