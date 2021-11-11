package Diy;

import java.util.Scanner;

public class patterncube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i < x; i++) {
            if (i == 1) {
                for (int j = x - 1; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < x; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = x - 1; j >= i; j--) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < x - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < i - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < x - 2; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        for (int i = 1; i < x; i++) {
            if (i == x - 1) {
                for (int j = 0; j < x; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 0; j < x - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = x - 3; j >= i; j--) {
                    System.out.print(" ");
                }
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
//input->10
//output->
    *****
   *   **
  *   * *
 *   *  *
*****   *
*   *  *
*   * *
*   **
*****