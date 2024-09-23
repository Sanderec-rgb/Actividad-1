public class TemporaryEmployee extends Employee {
  private int contractDuration;

  public TemporaryEmployee(int id, String name, String department, int contractDuration) {
    super(id, name, department);
    this.contractDuration = contractDuration;
  }

  public int getContractDuration() {
    return contractDuration;
  }

  @Override
  public void updateEmployeeRecord(String newName, String newDepartment) {
    super.setName(newName);
    super.setDepartment(newDepartment);
  }

  public static void main(String[] args) {
    // You can add some test code here to demonstrate the usage of the TemporaryEmployee class
    TemporaryEmployee tempEmployee = new TemporaryEmployee(1, "John Doe", "IT", 6);
    tempEmployee.updateEmployeeRecord("Jane Doe", "HR");
    System.out.println("Contract duration: " + tempEmployee.getContractDuration());
    System.out.println("Name: " + tempEmployee.getName());
    System.out.println("Department: " + tempEmployee.getDepartment());
  }
}