package DataStructures;

import java.util.*;

public class SolutionB {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum = Integer.MIN_VALUE, arr_sum = 0;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
                if(arr[i][j]<10 && arr[i][j] <-10){
                    break;
                }
            }
        }
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                arr_sum = arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i][j]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];

                if(sum < arr_sum){
                    sum = arr_sum;
                }
            }
        }
        System.out.println(sum);

    }
}
