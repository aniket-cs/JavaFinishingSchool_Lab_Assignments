package Lab7.com.cg.ejs.pl;
import Lab7.com.cg.ejs.beans.Employee;
import Lab7.com.cg.ejs.service.EmployeeService;
import java.util.Scanner;

public class EmployeeServiceImp implements EmployeeService {
    @Override
    public Employee getEmpDetails(){
        String designation;
        String insuranceScheme=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Emp id");
        int id=sc.nextInt();
        System.out.println("Enter Emp Name");
        String name=sc.next();
        System.out.println("Enter the Salary of the Emp");
        double salary=sc.nextDouble();
        if(salary<=5000)
            designation="Clerk";
        else if(salary>5000 && salary<20000)
            designation="System Associate";
        else if(salary>=20000 && salary<40000)
            designation="Programmer";
        else
            designation="Manager";
        Employee emp=new Employee(id,name,designation,insuranceScheme,salary);
        return emp;
    }

    @Override
    public String insuranceScheme(String designation) {
        String Scheme;
        if(designation == "Clerk")
            Scheme="No Scheme";
        else if(designation == "System Associate")
            Scheme="Scheme C";
        else if(designation == "Programmer")
            Scheme="Scheme B";
        else
            Scheme="Scheme A";
        return Scheme;
    }

    @Override
    public void EmpDetails(Employee emp) {
        System.out.println("Employee Id:- "+emp.id);
        System.out.println("Employee Name:- "+emp.name);
        System.out.println("Employee Designation:- "+emp.designation);
        System.out.println("Employee Salary:- "+emp.salary);
        System.out.println("Employee InsuranceScheme:- "+emp.insuranceScheme);
    }
}
