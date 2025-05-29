package Recursion;
import java.util.*;
public class SubsetWithDuplicates {
    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);  // Sort the array to group duplicates
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());  // start with the empty subset

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;

            // if current element is same as previous, adjust start to avoid duplicate subsets
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }

            end = outer.size() - 1;  // update end to current last index
            int n = outer.size();    // total current subsets in outer

            // create new subsets by adding current element to existing subsets from 'start' to 'n'
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));  // copy existing subset
                internal.add(arr[i]);  // add current element
                outer.add(internal);   // add new subset to outer list
            }
        }

        return outer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> result = subsetDuplicate(arr);

        // print the final subsets
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
