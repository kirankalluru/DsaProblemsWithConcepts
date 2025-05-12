package Recursion;

import java.util.Arrays;

public class Patterns {
    public static void main(String[] args) {
    int[] arr = {2,5,3,4,1};
        System.out.print(Arrays.toString(selectionSort(arr,arr.length,0,0)));

    }

    static void pattern1(int r,int c){
        if (r == 0){
            return;
        }
        if(c<r){
            System.out.print("*");
            pattern1(r,c+1);

        }
        else{
            System.out.println();
            pattern1(r-1,0);
        }
    }


    static void pattern2(int r,int c){
        if (r == 0){
            return;
        }
        if(c<r){
            pattern2(r,c+1);
            System.out.print("*");

        }
        else{
            pattern2(r-1,0);
            System.out.println();
        }
    }

    static int[] bubbleSort(int[] arr,int r,int c){
        if (r == 0){
            return arr;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr,r,c+1);

        }
        else{
            bubbleSort(arr,r-1,0);

        }
        return arr;
    }

    static int[] selectionSort(int[] arr,int r,int c,int max){
        if (r == 0){
            return arr;
        }
        if(c<r){
            if(arr[c]>arr[max])
            {
                selectionSort(arr,r,c+1,c);
            }
            else{
                selectionSort(arr,r,c+1,max);
            }


        }
        else{

            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr,r-1,0,0);
        }
        return arr;
    }
}
