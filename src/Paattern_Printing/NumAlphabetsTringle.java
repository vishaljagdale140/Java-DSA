package Paattern_Printing;

import java.util.Scanner;

//Dought not solved

public class NumAlphabetsTringle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int a=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%2==1) System.out.print(j+" ");
                if(i%2==0) System.out.print((char)(j+64)+" " );
//                a++;

            }
            System.out.println();
        }
    }

}
