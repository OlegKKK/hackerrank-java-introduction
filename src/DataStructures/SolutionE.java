package DataStructures;

import java.util.*;

public class SolutionE {

    public static boolean win;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int c_i = 0; c_i < T; c_i++) {

            int arrayLength = scan.nextInt();
            int[] numArray = new int[arrayLength];
            int jump = scan.nextInt();
            for (int n_i = 0; n_i < arrayLength; n_i++) {
                numArray[n_i] = scan.nextInt();
            }
            win = false;
            play(0, numArray, jump);
            System.out.println((win) ? "YES" : "NO");
        }
    }

    public static void play(int pos, int[] array, int jump) {

        if (pos > array.length - 1 | pos + jump > array.length - 1 | pos + 1 > array.length - 1) {
            win = true;
        }

        array[pos] = 1;

        if (pos + jump < array.length && array[pos + jump] == 0) {
            play(pos + jump, array, jump);
        }
        if (pos + 1 < array.length && array[pos + 1] == 0) {
            play(pos + 1, array, jump);
        }
        if (pos - 1 >= 0 && array[pos - 1] == 0) {
            play(pos - 1, array, jump);
        }
    }
}