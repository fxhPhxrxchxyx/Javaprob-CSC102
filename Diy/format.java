package Diy;

import java.util.Scanner;

public class format {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String stock = sc.next();
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();
            System.out.printf("%-5s%+10.2f%+10.2f%,15.2f%n", stock, num1, num2, num3);
        }
    }
}
// input 4
// AOT 0.50 0.78 488335.20
// BDMS 0.30 1.27 267396.01
// BEM -0.10 -1.11 10322.25
// DELTA +16.00 +3.90 834742.88

// output
// AOT +0.50 +0.78 488,335.20
// BDMS +0.30 +1.27 267,396.01
// BEM -0.10 -1.11 10,322.25
// DELTA +16.00 +3.90 834,742.88