package Cognizant;

import java.util.Scanner;

public class SubArraySumTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,1,3,5,2,4,2};
        if(arr.length<3){
            System.out.println("not a valid array");
            return;
        }
        //logic 1

        int l = 0,r = 2,count = 0;
        while(r < arr.length){
            int sum = arr[l]+arr[r];
            if (sum == arr[r-1]){
                count++;
            }
            r++;
            l++;
        }

//        logic 2
//        int count = 0;
//        for (int i = 0; i <= arr.length - 3; i++) {
//            if (arr[i] + arr[i + 2] == arr[i + 1]) {
//                count++;
//            }
//        }


        System.out.println(count);
    }
}
