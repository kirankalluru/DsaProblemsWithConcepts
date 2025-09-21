package Cognizant;

import java.util.HashMap;

public class StringCost {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "xyzv";

        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            hm1.put(s1.charAt(i),hm1.getOrDefault(s1.charAt(i),0)+1);
        }

        for (int i = 0; i < s2.length(); i++) {
            hm2.put(s2.charAt(i),hm2.getOrDefault(s2.charAt(i),0)+1);
        }

        int cost = 0;

        for (char c : hm2.keySet()){
            int countIns1 = hm1.getOrDefault(c,0);
            int countIns2 = hm2.get(c);

            if(countIns2>countIns1){
                cost+=(countIns2-countIns1);
            }
        }

        System.out.println(cost);
    }
}
