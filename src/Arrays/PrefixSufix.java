package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSufix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        findPoductExcept(arr,n);
    }

    static  void findPoductExcept(int[] arr,int n){

        int prefix[] = new int[n];
        int sufix[] = new int[n];

        int ans[] = new int[n];
        prefix[0] = 1;
        sufix[n-1] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1]*arr[i-1];
        }

        for (int i = n-2; i >=0; i--) {
            sufix[i] = sufix[i+1]*arr[i+1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i]*sufix[i];
        }

        System.out.println(Arrays.toString(ans));


    }
}
