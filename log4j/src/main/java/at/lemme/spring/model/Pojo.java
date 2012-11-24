package at.lemme.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pojo {

  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE)
  private Long id;

  @Column(name="namecol")
  private String name;

  public Pojo() {
    // TODO Auto-generated constructor stub
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Pojo [id=" + id + ", name=" + name + "]";
  }

}
