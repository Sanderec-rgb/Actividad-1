import java.util.List;
import java.util.ArrayList;
public class Department {
    private int id;
    private String name;
    private List<Employee> employees;
    public Department(int id, String name) {
    this.id = id;
    this.name = name;
    this.employees = new ArrayList<>();
    }
    public int getId() {
    return id;
    }
    public String getName() {
    return name;
    }
    public List<Employee> getEmployees() {
    return employees;
    }
    public void addEmployee(Employee employee) {
    employees.add(employee);
    }
    public void removeEmployee(Employee employee) {
    employees.remove(employee);
    }
    }