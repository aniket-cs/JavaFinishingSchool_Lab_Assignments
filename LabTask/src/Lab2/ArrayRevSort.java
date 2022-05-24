package Lab2; //Q3

import java.util.Scanner;

public class ArrayRevSort {
    public static void main(String args[]) {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        //reading the number of elements from the that we want to enter
        n=sc.nextInt();

        int[] arr = new int[30];
        int revarr[] = new int[30];
        int i, j = n, temp = 0;


        System.out.println("Enter the elements of the array: ");
        for(i=0; i<n; i++)
        {
            //reading array elements from the user
            arr[i]=sc.nextInt();
        }


        // Reversing the array and store into revarr
        for (i = 0; i < n; i++) {
            revarr[j - 1] = arr[i];
            j--;
        }

        // printing the reversed array
        System.out.print("The intermediate result after reversing the input array :  ");
        for (i = 0; i < n; i++)
            System.out.print(revarr[i] + " ");


        // Sorting the revarr
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (revarr[i] > revarr[j]) {
                    temp = revarr[i];
                    revarr[i] = revarr[j];
                    revarr[j] = temp;
                }
            }
        }


        // printing the final sorted array
        System.out.print("\nThe Final Result after sorting the above array : ");
        for (i = 0; i < n; i++) {
            System.out.print(revarr[i] + " ");
        }

    }
}

