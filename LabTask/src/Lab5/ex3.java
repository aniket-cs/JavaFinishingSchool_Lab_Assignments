package Lab5;

import java.util.Scanner;


class EmployeeException extends Exception {

    public EmployeeException(String errorMessage){
        super(errorMessage);

    }

}

public class ex3 {

    static void salaryValidate(double salary) throws EmployeeException{

        if(salary < 3000.0)
            throw new EmployeeException("The salary should be greater than 3000");
        else
            System.out.println("\nValid Salary Input. You can proceed further");

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary of the employee : ");
        double salary = sc.nextDouble();

        try{
            salaryValidate(salary);
        }
        catch (EmployeeException e){
            System.out.println("\nInvalid Salary Input");

            System.out.println("Exception : " +e);
        }

    }
}
