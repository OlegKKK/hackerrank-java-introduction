package DataStructures;

import java.util.*;

public class SolutionD {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        ArrayList<int[]> al = new ArrayList<int[]>();
        int c = 0;
        while(n-- > 0){
            c = scan.nextInt();
            al.add(getlist(c));
        }
        int p = scan.nextInt();
        while(p-- > 0){
            int x = scan.nextInt();
            int y = scan.nextInt();
            try {
                int[] g = (int[])al.get(x-1);
                System.out.println(g[y-1]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
    public static int[] getlist(int n){
        int[] x = new int[n];
        for(int j = 0; j < n; j++){
            x[j] = scan.nextInt();
        }
        return x;
    }
}