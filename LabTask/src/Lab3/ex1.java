package Lab3; // Q1

import java.util.*;


public class ex1 {
    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter integers Unless u press enter");
        String size=sc.nextLine();
        StringTokenizer st=new StringTokenizer(size," ");
        while (st.hasMoreTokens()){
            String temp= st.nextToken();
            int num=Integer.parseInt(temp);
            System.out.println(num);
            sum=sum+num;
        }
        System.out.println("Sum of Integer:- "+sum);
    }
}