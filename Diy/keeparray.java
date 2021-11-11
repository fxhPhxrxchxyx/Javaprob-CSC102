package Diy;

import java.util.Scanner;

public class keeparray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            arr3[i + size1] = arr2[i];
        }
        for (int i = 0; i < size1 + size2; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
// Input->6 5
// 1 2 3 4 5 6
// 3 4 5 6 7
// output->1 2 3 4 5 6 3 4 5 6 7