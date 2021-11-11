package Diy;

import java.util.Scanner;

public class sumrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[roll][column];
        for (int i = 0; i < roll; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // รับค่า
        for (int i = 0; i < roll; i++) {
            int result = 0;
            for (int j = 0; j < column; j++) {
                result += arr[i][j]; // เก็บค่า
            }
            System.out.println("sum of row#" + i + " is " + result);
        }
    }
}
// input->4 5
// 16 10 2 21 1
// 33 49 62 35 9
// 45 27 15 67 40
// 52 56 84 18 2
// output->
// sum of row#0 is 50
// sum of row#1 is 188
// sum of row#2 is 194
// sum of row#3 is 212