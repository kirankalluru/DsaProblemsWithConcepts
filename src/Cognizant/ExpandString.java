package Cognizant;

import java.util.Scanner;

public class ExpandString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abdbc";
        StringBuilder sb = new StringBuilder();
        int[] charFirstOccurance = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if(charFirstOccurance[index] == 0){
                charFirstOccurance[index] = i+1;
            }

            if(i>0){
                sb.append("-");
            }

            int repatCount = charFirstOccurance[index];
            while (repatCount>0){
                sb.append(s.charAt(i));
                repatCount--;
            }

        }
        System.out.println(sb.toString());
    }
}
