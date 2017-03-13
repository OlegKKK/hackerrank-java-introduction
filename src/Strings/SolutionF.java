package Strings;

import java.util.*;

    public class SolutionF {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            scan.close();
            StringTokenizer st = new StringTokenizer(s," !,?._'@");
            System.out.println(st.countTokens());
            while(st.hasMoreTokens()){
                System.out.println(st.nextToken());
            }
        }
    }