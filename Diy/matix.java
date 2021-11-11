package Diy;

import java.util.Scanner;

public class matix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowM1 = sc.nextInt();
        int colM1 = sc.nextInt();
        int rowM2 = sc.nextInt();
        int colM2 = sc.nextInt();
        int[][] M1 = new int[rowM1][colM1];
        int[][] M2 = new int[rowM2][colM2];
        int[][] result = new int[rowM1][colM2];

        for (int i = 0; i < rowM1; i++) {
            for (int j = 0; j < colM1; j++) {
                M1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rowM2; i++) {
            for (int j = 0; j < colM2; j++) {
                M2[i][j] = sc.nextInt();
            }
        }
        if (colM1 == rowM2) {
            for (int i = 0; i < rowM1; i++) {
                int count = 0;
                for (int j = 0; j < colM2; j++) {
                    for (int k = 0; k < colM1; k++) {
                        count += M1[i][k] * M2[k][j];
                    }
                    result[i][j] = count;
                    count = 0;
                }
            }
            for (int i = 0; i < rowM1; i++) {
                for (int j = 0; j < colM2; j++) {
                    System.out.print(result[i][j] + " ");
                }
            }
        }

        else {
            System.out.print("Invalid");
        }

    }
}
// input->2 3 3 2
// 1 2 3 4 5 6
// 7 8 9 10 11 12
// output->58 64 139 154
// input 2 2 3 3
// 5 6 7 8
// 9 0 1 2 3 5 8 2 4
// output->Invalid