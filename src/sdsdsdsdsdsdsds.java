
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sin;

public class sdsdsdsdsdsdsds {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useLocale(Locale.UK);
        double x = readDouble();
        double y = readDouble();
        String result = getResult(x, y);
        System.out.println(result);
    }

    public static double readDouble() {
        return scanner.nextDouble();
    }

    public static String getResult(double x, double y) {
        double eps = 1e-5;
        if (y - 2 - x*x < eps && y - x < eps ) {
            return "Yes";
        } else {
            return "No";
        }

    }

}
