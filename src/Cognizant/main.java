package Cognizant;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcbbcd";
        int start = 0,end = 0;
        int len = 0;
        for(int i=0;i<s.length();i++){
            int odd = palindromecheck(s,i,i);
            int even = palindromecheck(s,i,i+1);

            len = Math.max(len,Math.max(odd,even));
            int currLen = Math.max(odd, even);

            if (currLen > end - start) {
                // Update start and end based on palindrome length
                start = i - (currLen - 1) / 2;
                end = i + currLen / 2;
            }
        }
        System.out.println(len);
        System.out.println(s.substring(start,end+1));
    }

    static int palindromecheck(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}
