package Recursion;


public class Diceroll {
    public static void main(String[] args) {
        dr("",4);
    }

    static void dr(String p,int target){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i<= target; i++) {
            dr(p+i,target-i);
        }


    }
}
