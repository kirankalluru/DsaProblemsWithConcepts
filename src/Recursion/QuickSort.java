package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int nums[] = {5,3,4,6,10};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = nums[m];

        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }

            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        //Now my pivot is at correct position it should be so now sort two halves that are at either sides of pivot

        sort(nums,low,e);
        sort(nums,s,high);



    }
}
