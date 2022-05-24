package Lab7.com.cg.ejs.service;
import Lab7.com.cg.ejs.beans.Employee;


public interface EmployeeService {
    public Employee getEmpDetails();
    public String insuranceScheme(String designation);
    public void EmpDetails(Employee emp);
}
