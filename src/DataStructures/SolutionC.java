package DataStructures;

import java.util.*;

public class SolutionC {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt(), i = 0, sum, res=0;
        int[] arr = new int[len];

        while(in.hasNext()) arr[i++] = in.nextInt();
        for(i=0;i<len;i++){
            sum = 0;
            for(int j=i;j<len;j++){
                sum += arr[j];
                if(sum<0) res++;
            }
        }

        System.out.println(res);
    }
}