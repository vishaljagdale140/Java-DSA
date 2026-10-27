package Methods;

import java.util.Scanner;

// WITHOUT FUNCTION

public class PermutationAndCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfact = 1;
        for(int i=1; i<=n; i++){
            nfact *= i;
        }
//        System.out.println(nfact);
        int rfact = 1;
        for(int j=1; j<=r; j++){
            rfact *= j;
        }
//        System.out.println(rfact);
        int nrfact = 1;
        for(int i=1; i<=n-r; i++){
            nrfact *= i;
        }
//        System.out.println(nrfact);
        int ncr = nfact / (rfact*nrfact);
        System.out.println(ncr);
    }
}
