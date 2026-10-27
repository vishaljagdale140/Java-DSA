package Methods;

import java.util.Scanner;

public class PassByValueAndeference {
    public static void change(int x){
        x=10;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int x=8;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
