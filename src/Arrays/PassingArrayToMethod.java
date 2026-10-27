package Arrays;

import java.util.Scanner;

public class PassingArrayToMethod {
    public static void main(String[] args) {
        int x[] = {5,5,88,8,5,8,4};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }

    public static void change(int[] y){
        y[2] = 57;

    }
}
