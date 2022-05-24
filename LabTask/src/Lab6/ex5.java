package Lab6;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex5 {
    public static int getSecondSmallest(Integer[] a){
        List<Integer> list= Arrays.asList(a);
        Collections.sort(list);
        int element=list.get(1);
        return element;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Integer a[]={1,2,5,6,3,2};
        System.out.println("Second Smallest: "+getSecondSmallest(a));
    }
}
