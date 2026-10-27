package Arrays;

public class LineaerSearch2 {
    public static void main(String[] args) {
        int[] arr = {12,3,27,53,18,62,88,6,53};
        int target = 12;
        int found =-485;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==target){
                found=i;
                break;
            }
        }
        if(found!=-485) System.out.println("Target Exist in array: ");
        else System.out.println("Target is not Exist in Array: ");
    }
}
