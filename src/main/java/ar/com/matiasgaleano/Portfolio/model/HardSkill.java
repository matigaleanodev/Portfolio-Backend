package ar.com.matiasgaleano.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class HardSkill {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String type;
  private String image;
  private String url;

  public HardSkill() {
  }

  public HardSkill(Long id, String name, String type, String image, String url) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.image = image;
    this.url = url;
  }
  
    
}
