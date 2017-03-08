package Strings;

import java.util.*;

    public class SolutionD {


        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B="";
            int c=A.length()-1;
            for(int i=c;i>=0;i--)
            {
                B+=A.charAt(i);
            }
            if(A.equals(B))
                System.out.print("Yes");
            else
                System.out.print("No");
        }
    }