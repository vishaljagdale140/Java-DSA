package Arrays;

import java.util.Scanner;

public class MaxElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {4,7,8,6,-5,-8,10};
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array Element :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.println(max);



    }
}
