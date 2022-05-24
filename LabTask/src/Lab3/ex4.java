package Lab3;

import java.util.Scanner;

public class ex4 {
    public static int modifyNumber(int number){
        StringBuffer sc = new StringBuffer("");
        String num = String.valueOf(number);
        int c=0;
        for(int i=0;i<num.length()-1;i++){
            char ch1 = num.charAt(i);
            char ch2 = num.charAt(i+1);
            int a=Character.getNumericValue(ch1);
            int b=Character.getNumericValue(ch2);
            c = a-b;

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        ex4 q4 = new ex4();

        System.out.println(ex4.modifyNumber(num));
    }
}
