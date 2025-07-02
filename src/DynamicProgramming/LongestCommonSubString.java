package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonSubString {
    static int[][] dp;
    static String s1;
    static String s2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        s1 = sc.next();
        s2 = sc.next();
        dp = new int[n+1][m+1];
        for(int[] num : dp){
            Arrays.fill(num,-1);
        }
        System.out.println(longestCommonsubseq_Dp(n,m));
    }
    //-------------------------------bruteforce------------------------------------
    //brute force solution takes 2^n time complexity
    static int longestCommonsubseq(String s1,String s2){
        if(s1.isEmpty()||s2.isEmpty()){
            return 0;
        }

        if (s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1)){
            return 1+longestCommonsubseq(s1.substring(0, s1.length()-1),s2.substring(0,s2.length()-1));
        }
        else{
            return Math.max(
                    longestCommonsubseq(s1.substring(0, s1.length() - 1), s2),
                    longestCommonsubseq(s1, s2.substring(0, s2.length() - 1))
            );
        }
    }

    //-------------------------------memorization--------------------------
    //O(n*m)	The code uses dynamic programming to solve the Longest Common Substring problem.
    // The function longestCommonsubseq_Dp has a nested loop that iterates through all possible
    // combinations of characters in the two input strings s1 and s2,
    // resulting in a time complexity of O(n*m),
    // where n is the length of s1 and m is the length of s2.
    static int longestCommonsubseq_Dp(int n,int m){
        if (n==0 || m == 0){
            return 0;
        }

        if (dp[n][m] != -1){
            return dp[n][m];
        }
        if (s1.charAt(n-1) == s2.charAt(m-1)){
            return dp[n][m] = 1+longestCommonsubseq_Dp(n-1,m-1);
        }
        else{
            dp[n][m] = Math.max(longestCommonsubseq_Dp(n-1,m),longestCommonsubseq_Dp(n,m-1));
        }

        return dp[n][m];
    }
}
