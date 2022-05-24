package Lab6;
import java.util.*;

public class ex2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        OccuringChar(str);
    }
    public static void OccuringChar(String str){
        int count[]=new int[256];
        int len=str.length();
        for(int i=0;i<len;i++)
            count[str.charAt(i)]++;
        char ch[]=new char[str.length()];
        for(int i=0;i<len;i++){
            ch[i]=str.charAt(i);
            int f=0;
            for(int j=0;j<=i;j++){
                if(str.charAt(i)==ch[j])
                    f++;
            }
            if(f==1)
                System.out.println("Number of Occurrence of "+str.charAt(i)+" is:"+count[str.charAt(i)]);
        }
    }
}