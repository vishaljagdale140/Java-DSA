package Arrays;

public class FOreachLoop {
    public static void main(String[] args) {
        int[] arr = {5,8,4,3,9,7,5,1,2,22};
//        for(int ele : arr){
//            System.out.print(ele);
//        }
        for(int i=0; i<arr.length; i++){
            arr[i]*=2;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
