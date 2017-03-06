package Strings;

import java.util.*;

public class SolutionB {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp="";
        int start=0,stop=0;
        while(s.hasNext()){
            inp = s.next();
            start=s.nextInt();
            stop =s.nextInt();
        }
        System.out.println(inp.substring(start,stop));

    }

}