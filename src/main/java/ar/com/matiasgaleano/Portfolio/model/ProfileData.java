/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class ProfileData {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String subtitle;
  private String adress;
  private String image;
  @Column(length=1000)
  private String description;

  public ProfileData() {
  }

  public ProfileData(Long id, String name, String subtitle, String adress, String image, String description) {
    this.id = id;
    this.name = name;
    this.subtitle = subtitle;
    this.adress = adress;
    this.image = image;
    this.description = description;
  }
  
  
  
}
