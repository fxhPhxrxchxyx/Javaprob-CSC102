package Diy;

import java.util.Scanner;

public class recursionfibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(fibonacci(num));
    }

    static int fibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
