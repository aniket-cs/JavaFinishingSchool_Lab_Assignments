package Lab3;
import java.util.*;


public class ex8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.println("Enter the String");
        String str=sc.next();
        int len=str.length();
        for(int i=0;i<len-1;i++){
            char ch=str.charAt(i);
            char ch1=str.charAt(i+1);
            if(ch<ch1){

            }else{
                c=1;
            }
        }
        if(c>0){
            System.out.println("The string is not positive");
        }
        else
            System.out.println("The string is positive");
    }
}
