package Lab6;
import java.util.*;

public class ex3 {
    public static HashMap method(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n: array) {
            map.put( n, n*n);
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array:- ");
        int size=sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the Element:- "+size);
        for(int i=0;i<size;i++){
            array[i]= sc.nextInt();
        }
        HashMap<Integer, Integer> map = method(array);
        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()){
            Integer key = it.next();
            System.out.println("Key: "+ key + "  Value: " + map.get(key));
        }
    }
}
