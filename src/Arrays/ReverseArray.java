package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4,7,8,5,4,6,88,8,5,6};
        int n = arr.length;
        for(int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;


        }
//        int i=0, j=n-1;
//        while(i<j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
        for(int ele : arr) System.out.print(ele+" ");
    }

}
