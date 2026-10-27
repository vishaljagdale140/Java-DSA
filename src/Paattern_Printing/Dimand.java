package Paattern_Printing;

import java.util.Scanner;

public class Dimand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1, nsp = n-1;
        for(int i=1; i<=n; i++){
            for(int k=1; k<=nsp; k++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++) {
                System.out.print("* ");
            }
            nst+=2;
            nsp--;
            System.out.println();
        }
        nst =2*n-3; nsp = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=nst; k++){
                System.out.print("* ");
            }
            nst-=2;
            nsp++;
            System.out.println();
        }
    }
}
