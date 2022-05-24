package Lab5;


import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws BlankNameException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name :");
        String Fname = sc.nextLine();
        System.out.println("Enter Last name :");
        String Lname = sc.nextLine();

        try {
            if(Fname.isBlank() || Lname.isBlank()){
                throw new BlankNameException("First Name or Last Name cannot be Blank!");
            }else {
                System.out.println("Name Registered :"+Fname+" "+Lname);
            }
        }catch (BlankNameException e){
            e.printStackTrace();
        }
    }
}

class BlankNameException extends Exception{
    public BlankNameException(String msg){
        super(msg);
    }
}