package Lab3;
import java.util.*;

public class ex5 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text");
        String str=sc.nextLine();
        int len=str.length();
        String word[]=str.trim().split("\\s+");
        System.out.println("The no of word in a string is:- "+word.length);
        System.out.println("The no of char in a string is:- "+len);
    }
}