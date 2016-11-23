package Introduction;

import java.util.*;

public class SolutionC {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        if(n%2==1 || ( (n%2==0) && (n>=6 && n <= 20 ) ) ){
            ans = "Weird";
        }
        else{
            ans = "Not Weird";
        }
        System.out.println(ans);

    }
}