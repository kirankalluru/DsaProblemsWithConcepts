package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] arr = new boolean[n+1];

        Arrays.fill(arr,true);
        arr[0] = arr[1] = false;
        for (int i = 2; i < arr.length; i++) {
            if(arr[i]){
                for (int j=i*i; j < arr.length; j+=i) {
                    arr[j] = false;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
