import java.util.*;

public class SolutionF {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int x = 1; x < 11; x++){
            System.out.printf("%d x %d = %d %n", N, x, N*x);
        }
    }
}