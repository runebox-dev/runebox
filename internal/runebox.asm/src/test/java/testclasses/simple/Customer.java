package testclasses.simple;

public class Customer {

  private String name;
  protected int age;
  public Boolean isActive;
  
  public Customer(String name, int age, Boolean isActive) {
    this.name = name;
    this.age = age;
    this.isActive = isActive;
  }
  
  public String getName() {
    return name;
  }

  protected int getAge() {
    return age;
  }
  
  public Boolean getIsActive() {
    return isActive;
  }
}