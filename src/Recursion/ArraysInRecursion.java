package Recursion;

import java.util.ArrayList;

public class ArraysInRecursion {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(rbs(arr,2,0,arr.length-1));
    }

    static boolean isSorted(int[] arr,int index){
        if (index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && isSorted(arr, index+1);
    }


    static int searchElementLinearly(int[] arr,int key,int index){
        if (index == arr.length){
            return -1;
        }

        if (arr[index] == key){
            return index;
        }
        else {
            return searchElementLinearly(arr,key,index+1);
        }
    }


    static ArrayList<Integer> searchAllElementLinearly(int[] arr, int key, int index,ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }

        if (arr[index] == key){
            list.add(index);
        }

            return searchAllElementLinearly(arr,key,index+1,list);

    }


    //in this we won't pass list instead we create a list at every function call we will sum up together
    //then we return list do check the function

    static ArrayList<Integer> searchAllElementLinearly2(int[] arr, int key, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }

        if (arr[index] == key){
            list.add(index);
        }
        //previous call results added to the list
        ArrayList<Integer> ansFromBelowCalls = searchAllElementLinearly2(arr,key,index+1);
        list.addAll(ansFromBelowCalls);
        return list;

    }

    //rotated binary search
//    arr = {5,6,7,8,9,1,2,3,4};

    static int  rbs(int[] arr,int target,int s,int e){
        if (s>e){
            return -1;
        }
        int m = s+(e-s) / 2;

        if (arr[m] == target){
            return m;
        }
        if (arr[s]<=arr[m]){
            if (target>=arr[s] && target<=arr[m]){
                return rbs(arr, target, s, m-1);
            }
            else {
                return rbs(arr, target, m+1, e);
            }
        }

        if (target>=arr[m] && target <= arr[e]){
            return rbs(arr, target, m+1, e);
        }
        else {
            return rbs(arr, target, s, m-1);
        }

    }
}
