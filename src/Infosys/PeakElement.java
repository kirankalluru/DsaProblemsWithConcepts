package Infosys;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        System.out.println(solution(arr));
    }
    static int solution(int[] arr){
        int high = arr.length-1;
        int low = 0,mid=0;
        while (low<high){
            mid = (low + high)/2;
            if (arr[mid]>arr[mid+1]){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return arr[low];

    }
}
