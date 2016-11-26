package Introduction;

import java.util.Scanner;

public class SolutionD {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = Integer.parseInt(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        String c = scan.nextLine();
        System.out.println("String: " + c + "\nDouble: " + b + "\nInt: " + a);
    }
}