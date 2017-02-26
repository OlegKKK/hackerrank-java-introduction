package Introduction;

import java.util.*;
import java.io.*;

class SolutionG{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(i=0;i<n;i++)
            {
                a=a+(int) (Math.pow(2,i)*b);
                System.out.print(a+" ");
            }
            System.out.println();
            i=0;
        }

        in.close();
    }
}