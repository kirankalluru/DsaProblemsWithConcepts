package Arrays;

import java.util.Scanner;

public class parsingdata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input value(name + age + student(true/false)): ");
        String s = sc.nextLine();
//        System.out.println(s);
        String name = s.split(" ")[0];
        int age = Integer.parseInt(s.split(" ")[1]);
        boolean isStudent = Boolean.parseBoolean(s.split(" ")[2]);
        System.out.println(name + " "+ age + " "+isStudent);
    }
}
