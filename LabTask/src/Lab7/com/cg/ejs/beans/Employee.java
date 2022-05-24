
package Lab7.com.cg.ejs.beans;

public class Employee {
    public int id;
    public String name;
    public String designation;
    public String insuranceScheme;
    public double salary;
    public Employee(int id, String name, String designation, String insuranceScheme, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = insuranceScheme;
    }
}
