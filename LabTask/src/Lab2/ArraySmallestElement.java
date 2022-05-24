package Lab2; // Q1

import java.util.*;
public class ArraySmallestElement {


    public static int getSecondSmallest(int arr[]){
        Arrays.sort(arr);
        int length= arr.length;
        return arr[length-2];
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Element");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The 2nd Smallest element is:-"+getSecondSmallest(arr));
    }
}
