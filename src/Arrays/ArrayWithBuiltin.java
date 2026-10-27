package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayWithBuiltin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        //print(arr);
        Arrays.sort(arr);
        print(arr);


    }
    public static void print(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

