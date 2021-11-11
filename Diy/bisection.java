package Diy;

import java.util.Scanner;

public class bisection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c1 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double tol = sc.nextDouble();
        // tol = tololance
        double xns = (a + b) / 2;
        double newtol = (b - a) / 2;
        while (newtol > tol) {
            double f_xns = c1 + (c2 * (xns - Math.sin(xns)));
            double f_a = c1 + (c2 * (a - Math.sin(a)));
            if (f_xns * f_a < 0) {
                b = xns;
            } else {
                a = xns;
            }
            xns = (b + a) / 2;
            newtol = (b - a) / 2;
        }
        System.out.print(xns);
    }
}
// input->2 3 8 -4.5 0.001
// output->2.4306640625