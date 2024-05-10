package testclasses.simple;

public class Manager extends Employee implements Runnable {
  
  private int teamSize;

  public Manager(String name, int age, Boolean isActive, double salary, int teamSize) {
    super(name, age, isActive, salary);
    this.teamSize = teamSize;
  }

  public int getTeamSize() {
    return teamSize;
  }

  public void expandTeam(int members) {
    if(members >= 0) {
      this.teamSize += members;
    }
  }

  @Override
  public void run() {
    System.out.println("Manager is running");
  }
}