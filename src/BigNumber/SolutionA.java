package BigNumber;

import java.util.*;
import java.math.*;

public class SolutionA {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger a = new BigInteger(s.next());
        BigInteger b = new BigInteger(s.next());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}