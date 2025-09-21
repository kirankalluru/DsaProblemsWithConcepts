package Cognizant;

import java.util.Scanner;

public class FairSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,10,3,7,6};
        int totSum = 0,count = 0;
        for(int num : arr) totSum+=num;

        int l = 0;
        for (int i = 0; i < arr.length-1; i++) {
            l += arr[i];
            int r = totSum-l;
            if(Math.abs(r-l)%2 == 0){
                count++;
            }

        }

        System.out.println(count);
    }
}
