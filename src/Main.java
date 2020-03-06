
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sin;


public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useLocale(Locale.UK);
        double AgeraL = readDouble();
        double AgeraLoh = readDouble();
        String result = getResult(AgeraLoh, AgeraL);
        System.out.println(result);
    }

    public static double readDouble() {
        return scanner.nextDouble();
    }

    public static String getResult(double AgeraL, double AgeraLoh) {
        double eps = 1e-5;
        if (y - 0.5 < eps && x > 0 || y > 0 && y - sin(x) < eps) {
            return "Yes";
        } else {
            return "No";
        }

    }
}
&&||||




