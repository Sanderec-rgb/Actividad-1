public class ReportGenerator 
{
  public PerformanceReport generateIndividualPerformanceReport(Employee employee) 
  {
// Assume a simple performance score calculation based on employee type
    double performanceScore;
    if (employee instanceof PermanentEmployee) 
    {
      performanceScore = 0.8; // placeholder value
    } 
    else if (employee instanceof TemporaryEmployee) 
    {
      performanceScore = 0.6; // placeholder value
    } else {
      performanceScore = 0.0; // default value
    }
    return new PerformanceReport(employee, performanceScore);
  }
  public PerformanceReport generateDepartmentPerformanceReport(Department department)
  {
// Calculate average performance score for all employees in the department
    double totalScore = 0.0;
    int employeeCount = 0;
    for (Employee employee : department.getEmployees()) 
    {
      PerformanceReport individualReport = generateIndividualPerformanceReport(employee);
      totalScore += individualReport.getPerformanceScore();
      employeeCount++;
    }
    double averageScore = totalScore / employeeCount;
    return new PerformanceReport(null, averageScore);
  }
}