package Infosys;
import java.util.*;
public class WorkOuts {
    private static int totalCount;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int N = sc.nextInt();
        Integer[] arr = new Integer[N];  // Changed to Integer[]

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Now you can apply custom comparator
        Arrays.sort(arr, (a, b) -> b - a);

        System.out.println(noOfWorkouts(E, arr));
    }
    public static int noOfWorkouts(int E,Integer[] arr){
        if(E<=0){
            return -1;
        }
        int total = 0;
        for (Integer num : arr){
            total = total + (2*num);
        }
        if (total<E){
            return -1;
        }

        for (Integer num : arr){
            int count = 0;
            while (count<2){
                E = E - num;
                totalCount++;
                if (E<=0){
                    return totalCount;
                }
                count++;
            }
        }
        return  -1;
    }
}
