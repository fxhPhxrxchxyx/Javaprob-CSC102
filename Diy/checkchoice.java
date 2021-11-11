package Diy;

import java.util.Scanner;

public class checkchoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] result = new char[5];
        char[] check = { 'A', 'B', 'A', 'D', 'C' };
        int score = 0;
        for (int i = 0; i < 5; i++) {
            result[i] = sc.next().charAt(0);
        }
        for (int i = 0; i < 5; i++) {
            if (result[i] == check[i]) {
                score += 1;
            }
        }
        System.out.print(score);
    }
}
// input->B A A D C
// output->3
// A B A D C->5