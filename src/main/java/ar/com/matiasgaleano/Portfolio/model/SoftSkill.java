package ar.com.matiasgaleano.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class SoftSkill {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String description;
  private String image; 

  public SoftSkill() {
  }

  public SoftSkill(Long id, String name, String description, String image) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.image = image;
  }
    
}
