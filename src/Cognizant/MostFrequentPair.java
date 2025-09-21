package Cognizant;

import java.util.*;

public class MostFrequentPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(maxFrequency(s));
    }
    public static String maxFrequency(String s){
        String[] words = s.split("\\s+");
        Map<String, Integer> freq = new LinkedHashMap<>();
        for(String word : words){
            if(!word.isEmpty()){
                String pair = ""+word.charAt(0)+word.charAt(word.length()-1);
                freq.put(pair,freq.getOrDefault(pair,0)+1);
            }

        }

        int max = Collections.max(freq.values());

        for(String key:freq.keySet()){
            if (freq.get(key) == max){
                return key;
            }
        }
        return "";
    }
}
