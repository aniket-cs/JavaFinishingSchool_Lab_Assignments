package Lab3;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Mirror Sentence: ");
        String str = sc.next();
        String[] strArray = str.split(" ");
        for (String temp : strArray) {
            System.out.print(temp);
        }
        System.out.print("|");
        for (int i = 0; i < str.length(); i++) {
            char[] s1 = strArray[i].toCharArray();
            for (int j = s1.length - 1; j >= 0; j--) {
                System.out.print(s1[j]);
            }
            System.out.print(" ");
        }
    }
}
