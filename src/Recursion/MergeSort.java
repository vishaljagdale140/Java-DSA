package Recursion;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,3,10,5,2,8,6,2};
        mergeSort(arr);
        for(int ele : arr) System.out.print(ele+" ");
    }
    private static void mergeSort(int[] arr) {

        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n/2];
        int idx = 0;
        for(int i=0; i<a.length; i++) a[i] = arr[idx++];
        for(int j=0; j<b.length; j++) b[j] = arr[idx++];
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
    }

    public static void merge(int[] a,int[] b,int[] c) {
        int i=0, j=0, k=0;
        while (i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while (j<b.length) c[k++] = b[j++];

    }
}
