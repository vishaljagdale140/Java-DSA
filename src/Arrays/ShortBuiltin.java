package Arrays;

import java.util.Arrays;

public class ShortBuiltin {
    public static void main(String[] args) {
        int[] arr = {5,7,5,8,5,5,6,7,5,55,-5};
        print(arr);
        Arrays.sort(arr);
        print(arr);

    }

    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
