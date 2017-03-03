package Introduction;

import java.util.*;
import java.text.*;

public class SolutionL {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year),Integer.parseInt(month)-1,Integer.parseInt(day));
        System.out.println(((new SimpleDateFormat("EEEE")).format(cal.getTime())).toUpperCase());
    }
}