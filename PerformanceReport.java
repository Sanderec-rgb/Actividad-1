public class PerformanceReport {
    private Employee employee;
    private double performanceScore;
    public PerformanceReport(Employee employee, double         performanceScore) {
    this.employee = employee;
    this.performanceScore = performanceScore;
    }
    public Employee getEmployee() {
    return employee;
    }
    public double getPerformanceScore() {
    return performanceScore;
    }
  }