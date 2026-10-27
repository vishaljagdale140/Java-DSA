package Arrays;

import java.util.Scanner;

public class NegativeElementonly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array Element :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i]<0) System.out.print(arr[i]+" ");
        }
    }
}
