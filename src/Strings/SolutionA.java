package Strings;

import java.util.*;

public class SolutionA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int sum = a.length() + b.length();

        System.out.println(sum);
        System.out.println(a.compareToIgnoreCase(b) > 0 ? "Yes" : "No");
        System.out.print(Character.toString(a.charAt(0)).toUpperCase() + a.substring(1) + " "
                + Character.toString(b.charAt(0)).toUpperCase() + b.substring(1));
    }
}