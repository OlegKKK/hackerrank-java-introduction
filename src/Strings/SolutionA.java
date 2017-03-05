package Strings;

import java.util.*;

public class SolutionA {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int length = A.length() + B.length();
        System.out.println(length);
        if(A.compareTo(B)==1){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
        String output = A.substring(0, 1).toUpperCase() + A.substring(1) + " "+B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(output);
    }
}