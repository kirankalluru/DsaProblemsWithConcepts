package PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class Prefix_Sum_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefix = new int[n+1];
        prefix[0] = 0;
        for(int i=1;i<=n;i++){
            prefix[i] = prefix[i-1] + arr[i-1];
        }

        System.out.println(Arrays.toString(prefix));
        System.out.println("Enter SubArray range");
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(prefix[j+1] - prefix[i]);
    }
}
