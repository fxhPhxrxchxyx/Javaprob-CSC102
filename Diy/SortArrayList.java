package Diy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> items = new ArrayList<Integer>();
        while (true) {
            int item = sc.nextInt();
            if (item == -1) {
                break;
            }
            items.add(item);
        }
        Collections.sort(items);
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }
        System.out.println();
        Collections.reverse(items);
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }
    }
}
// input
// 3 5 8 1 4 2 7 6 -1

// output
// 1 2 3 4 5 6 7 8
// 8 7 6 5 4 3 2 1