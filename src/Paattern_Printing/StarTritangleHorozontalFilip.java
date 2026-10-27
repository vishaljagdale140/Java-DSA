package Paattern_Printing;

import java.util.Scanner;

public class StarTritangleHorozontalFilip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (2*n+1)/2, b = n-1;
        for(int i=1; i<=n; i++){
            for(int k=1; k<=i; k++){
                System.out.print("  ");
            }
            for(int j=1; j<=a; j++){
                System.out.print("*"+" ");
            }
            a--;
            System.out.println();
        }

    }
}
