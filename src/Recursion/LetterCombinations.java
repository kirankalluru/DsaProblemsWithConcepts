package Recursion;
import java.util.*;
public class LetterCombinations {
    public static void main(String[] args) {
        String digits = "23";
        if(digits.isEmpty()) {
            System.out.println("");
            return;
        }
        System.out.println(lc("",digits));
    }
    static List<String> lc(String p,String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        int i=(digit-2)*3;
        if(digit > 7) {
            i+=1;
        }
        int len = i+3;
        if(digit == 7 || digit == 9) {
            len+=1;
        }


        List<String> list = new ArrayList<>();
        for(;i<len;i++){
            char ch = (char)('a'+i);
            list.addAll(lc(p+ch,up.substring(1)));
        }
        return list;
    }
}
