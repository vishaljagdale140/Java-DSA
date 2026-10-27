package Methods;

import java.util.Scanner;

public class MaxOfThreeBuiltin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(Math.max(Math.max(a,b),c));
    }
}
