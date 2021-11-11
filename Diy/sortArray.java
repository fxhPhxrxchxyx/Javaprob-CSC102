package Diy;

import java.util.Scanner;
import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
// input->10
// 54 37 15 28 51 69 78 19 23 84
// output->15 19 23 28 37 51 54 69 78 84