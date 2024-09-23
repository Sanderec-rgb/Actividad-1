public class PermanentEmployee extends Employee {
   private double salary;
  
   public PermanentEmployee(int id, String name, String department, double salary) 
   {
     super(id, name, department);
     this.salary = salary;
   }
   public double getSalary() 
   {
     return salary;
   }
   public void setSalary(double salary)
   {
     this.salary = salary;
   }
   public void updateEmployeeRecord(String newName, String newDepartment) {
     super.setName(newName);
     super.setDepartment(newDepartment);
  }
}
