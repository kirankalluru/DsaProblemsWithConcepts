package Arrays;
import java.util.*;

public class TopKElements {
    public static void main(String[] args) {
        int k = 2;
        int[] arr = {2,2,23};
        if (k>arr.length){
            System.out.println("Array Size is less😔");
            return;
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int j : arr) {
            hm.put(j, hm.getOrDefault(j, 0) + 1);
        }
        List<int[]> mapelements = new ArrayList<>();

        for (Map.Entry<Integer,Integer> entry : hm.entrySet()){
            mapelements.add(new int[]{entry.getValue(),entry.getKey()});
        }
        mapelements.sort((a,b)->b[0]-a[0]);

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = mapelements.get(i)[1];
        }

        System.out.println(Arrays.toString(ans));
    }
}
