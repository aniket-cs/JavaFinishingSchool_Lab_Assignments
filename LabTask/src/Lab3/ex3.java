package Lab3;
import java.util.*;


public class ex3 {
    public static String alterString(String str) {
        String str2 = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if ((ch != 'A') && (ch != 'E') && (ch != 'I') && (ch != 'O') && (ch != 'U')) {
                int n = ch + 1;
                str2 = str2 + (char) n;
            } else
                str2 = str2 + ch;
        }
        return str2;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word");
        String str = sc.nextLine();
        str = str.toUpperCase(Locale.ROOT);
        System.out.println("String replacing all the consonants with the next character:- " + alterString(str));
    }
}
