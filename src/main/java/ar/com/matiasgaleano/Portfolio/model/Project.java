package ar.com.matiasgaleano.Portfolio.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Project {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String description;
  private Date date;
  private String image;
  private String frontUrl;  
  private String backUrl;
  private String demoUrl;

  public Project() {
  }

  public Project(Long id, String name, String description, Date date, String image, String frontUrl, String backUrl, String demoUrl) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.date = date;
    this.image = image;
    this.frontUrl = frontUrl;
    this.backUrl = backUrl;
    this.demoUrl = demoUrl;
  }
  
}
