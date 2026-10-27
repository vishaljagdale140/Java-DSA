package Arrays;

public class EvenOddMultAndAdd {
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 2, 3, 7};
        for (int i = 0; i<arr.length; i++) {
            if (i % 2 == 1) arr[i] *= 2;
            else arr[i] += 10;
        }
        print(arr);

    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}