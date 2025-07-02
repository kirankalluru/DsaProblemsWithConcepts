package Recursion;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "A man, a plan, a canal: Panama";
        String ns = s.replaceAll("[^A-Za-z]","");
        System.out.println(ns);
    }


}

