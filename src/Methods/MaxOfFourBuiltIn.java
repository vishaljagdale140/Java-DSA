package Methods;

import java.util.Scanner;

public class MaxOfFourBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(Math.max(Math.max(a,b),Math.max(c,d)));
    }
}
