package Infosys;

import java.util.Scanner;

public class HeroVillan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of heros:");
        int hero = sc.nextInt();
        System.out.print("No of villans:");
        int villan = sc.nextInt();
        System.out.print("Health of heros:");
        int hero_health = sc.nextInt();
        System.out.print("health of "+villan+" villans are:");
        int[] v = new int[villan];
        for (int i = 0; i < villan; i++) {
            v[i] = sc.nextInt();
        }
        System.out.println(minVillanRemoved(hero,villan,hero_health,v));
    }

    static int minVillanRemoved(int hero,int villan,int hero_health,int[] v){
        int l = 0;
        int h = v.length;

        int ans = -1;
        while (l<=h){
            int mid = (l+h)/2;
            if (simulateBattle(v,mid,hero,hero_health)){
                ans = mid;
                h = mid - 1;

            }
            else{
                l = mid + 1;
            }
        }

        return ans;
    }

    static boolean simulateBattle(int[] villan,int start_idx,int hero,int hero_health){
        int i = start_idx;
        int H = hero_health;
        while (i<villan.length){
            if (hero == 0){
                return false;
            }

            int v = villan[i];

            if (hero_health > v){
                hero_health = hero_health - v;
                i++;
            } else if (hero_health<v) {
                hero--;
                hero_health = H;
            }
            else{
                hero--;
                i++;
                hero_health = H;

            }
        }

        return true;
    }

}
