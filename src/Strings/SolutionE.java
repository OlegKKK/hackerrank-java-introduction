package Strings;

import java.util.*;

public class SolutionE {
static boolean isAnagram(String a, String b) {

        char[] first = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        if(Arrays.equals(first, second)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}