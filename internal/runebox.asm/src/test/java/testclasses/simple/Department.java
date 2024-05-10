package testclasses.simple;

import java.util.List;

public class Department {

  public static final String COMPANY_NAME = "MyCompany";
  
  private List<Employee> employees;
  
  public Department(List<Employee> employees) {
    this.employees = employees;
  }

  public static String getCompanyName() {
    return COMPANY_NAME;
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public final void addEmployee(Employee employee) {
    employees.add(employee);
  }
}