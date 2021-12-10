package Diy;

import java.util.Scanner;

public class digitdouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        int digit = sc.nextInt();
        System.out.printf("%." + digit + "f", num);
    }
}

// input 2.46733 2
// output 2.47