package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        int[] nums = new int[arr.length];
        for(int i=0;i<k;i++){
            nums[i] = arr[arr.length-k+i];
        }
        int j=0;
        for(int i=k;i<nums.length;i++){
            nums[i] = arr[j];
            j++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
