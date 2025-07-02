package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }




        int prefix[] = new int[n];
        int sufix[] = new int[n];   
        prefix[0] = 1;
        sufix[n-1] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1]*arr[i-1];
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(prefix));
    }
}
