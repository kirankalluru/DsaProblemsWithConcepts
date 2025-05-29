package Recursion;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
//            subseq("","abc");
        System.out.println(subseqretAscii("","abc"));
    }

    static void subseq(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        subseq(p+c,up.substring(1));
        subseq(p,up.substring(1));
    }


    static ArrayList<String> subseqret(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char c = up.charAt(0);
        ArrayList<String> left = subseqret(p+c,up.substring(1));
        ArrayList<String> right = subseqret(p,up.substring(1));

        left.addAll(right);
        return left;
    }

    static ArrayList<String> subseqretAscii(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char c = up.charAt(0);
        ArrayList<String> first = subseqretAscii(p+c,up.substring(1));
        ArrayList<String> second = subseqretAscii(p,up.substring(1));
        ArrayList<String> third = subseqretAscii(p+(c+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
