package Recursion;

public class SkipChar {
    public static void main(String[] args) {
//        StringBuilder p = new StringBuilder();
        System.out.println(skipPartNotWord("eappeer"));
    }
    static void skip(StringBuilder p,String up){
        if (up.isEmpty()){
            System.out.println(p.toString());
            return;
        }

        char c = up.charAt(0);
        if (c == 'a' || c == 'b'){
            skip(p,up.substring(1));
        }
        else{
            skip(p.append(c),up.substring(1));
        }


    }


    static void skipOptimal(StringBuilder p,int idx,String up){
        if (up.length()==idx){
            System.out.println(p.toString());
            return;
        }

        char c = up.charAt(idx);
        if (c == 'a' || c == 'b'){
            skipOptimal(p,idx+1,up);
        }
        else{
            skipOptimal(p.append(up.charAt(idx)),idx+1,up);
        }


    }

    //other way to do it

    static String skipOtherWay(int idx,String up){
        if (idx==up.length()){
            return "";
        }

        char c = up.charAt(idx);
        if (c == 'a' || c == 'b'){
            return skipOtherWay(idx+1,up);
        }
        else{
            return c+skipOtherWay(idx+1,up);
        }


    }


    static String skipWord(String up){
        if (up.isEmpty()){
            return "";
        }


        if (up.startsWith("apple")){
            return skipWord(up.substring(5));
        }
        else{
            return up.charAt(0)+skipWord(up.substring(1));
        }


    }



    static String skipPartNotWord(String up){
        if (up.isEmpty()){
            return "";
        }


        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipPartNotWord(up.substring(3));
        }
        else{
            return up.charAt(0)+skipPartNotWord(up.substring(1));
        }


    }


}
