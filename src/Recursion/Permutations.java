package Recursion;

public class Permutations {
//    static int count = 0;
    public static void main(String[] args) {
        getPermutations("","abc");
//        System.out.println(count);
    }

    static void getPermutations(String p,String up){
        if (up.isEmpty()){
//            count++;   //this is to count no of permutations
            System.out.println(p);
            return;
        }
        int n = p.length();
        char c = up.charAt(0);
        for (int i = 0; i <= n ; i++) {
            String first = p.substring(0,i);
            String second = p.substring(i);
            getPermutations(first+c+second,up.substring(1));
        }
    }
}
