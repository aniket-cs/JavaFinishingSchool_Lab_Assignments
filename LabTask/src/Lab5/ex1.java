package Lab5;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age :- ");
        int age = s.nextInt();
        try {
            if (age > 15)
                throw new AgeException("Valid age Provided");
            else
                System.out.println("Invalid age Provided");
        } catch (AgeException ae) {
            System.out.println(ae);
        }
    }
}
class AgeException extends Exception {

    public AgeException(String str) {
        System.out.println(str);
    }
}