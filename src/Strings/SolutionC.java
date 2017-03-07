package Strings;

import java.util.*;

public class SolutionC {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n = sc.nextInt();
        String[] a=new String[s.length() - n + 1];
        for(int i=0; i<(s.length()-n+1); i++){
            a[i]=s.substring(i,(i+n));
        }
        String min=a[0];
        String max=a[0];
        for(int i=0; i<(s.length()-n+1); i++){
            if(a[i].compareTo(min)<0)
                min = a[i];
            if(a[i].compareTo(max)>0)
                max = a[i];
        }
        System.out.println(min+"\n"+max);
    }
}