package Arrays;

import java.util.Arrays;

public class MoveZerosToLast {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0};
        int index = 0,temp;
        for(int i=0;i< arr.length;i++){
            if(arr[i] != 0){
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
