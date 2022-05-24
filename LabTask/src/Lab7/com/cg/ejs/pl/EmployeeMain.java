package Lab7.com.cg.ejs.pl;
import Lab7.com.cg.ejs.beans.Employee;

public class EmployeeMain {
    public static void main(String args[]){
        EmployeeServiceImp emp=new EmployeeServiceImp();
        Employee Emp=emp.getEmpDetails();
        String Scheme= emp.insuranceScheme(Emp.designation);
        Employee person=new Employee(Emp.id,Emp.name,Emp.designation,Scheme,Emp.salary);
        emp.EmpDetails(person);
    }
}
