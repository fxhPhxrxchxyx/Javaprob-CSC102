package Diy;

import java.util.Scanner;

public class arrayaverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double result = 0;
        for (int i = 0; i < n; i++) {
            result += arr[i];
        }
        System.out.print(result / n);

    }
}
// input->10
// 1 2 3 4 5 6 7 8 9 10
// output->5.5