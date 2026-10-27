package Arrays;

public class SwapAnyTwoElement {
    public static void main(String[] args) {
        int[] arr = {5,10,8,2,555,56,2,57,4,11,99};
        int i=2, j=5;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr) System.out.print(ele+" ");
    }
}
