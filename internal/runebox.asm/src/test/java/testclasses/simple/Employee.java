package testclasses.simple;

public class Employee extends Customer {

  private double salary;

  public Employee(String name, int age, Boolean isActive, double salary) { 
    super(name, age, isActive);
    this.salary = salary;
  }
  
  public double getSalary() {
    return salary;
  }

  public void raiseSalary(double amount) {
    if(amount >= 0) {
      this.salary += amount;
    }
  }
}