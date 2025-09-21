package Cognizant;

import java.util.*;
public class MaxPermutationValue {
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }
    public static long maxPermutation(String[] arr, int N) {
        int maxLen = 0;
        for (String s : arr) {
            String noVowels = s.replaceAll("(?i)[aeiou]", "");
            maxLen = Math.max(maxLen, noVowels.length());
        }
        return maxLen == 0 ? 0 : factorial(maxLen);
    }
    public static void main(String[] args) {
        String[] arr = {"hello","world"};
        int N = 1;
        System.out.println(maxPermutation(arr, N));
    }

}
