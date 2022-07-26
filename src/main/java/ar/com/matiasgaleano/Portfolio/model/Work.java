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
public class Work {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String institution;
  private String title;
  private Date startDate;
  private Date endDate;
  private Boolean actual;
  private String description;  
  private String image;

  public Work() {
  }

  public Work(Long id, String institution, String title, Date startDate, Date endDate, Boolean actual, String description, String image) {
    this.id = id;
    this.institution = institution;
    this.title = title;
    this.startDate = startDate;
    this.endDate = endDate;
    this.actual = actual;
    this.description = description;
    this.image = image;
  }
    
}
