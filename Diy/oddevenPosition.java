package Diy;

import java.util.Scanner;

public class oddevenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String r1 = "";
        String r2 = "";
        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                r1 += word.charAt(i);
            } else {
                r2 += word.charAt(i);

            }
        }

        System.out.println(r1 + "\n" + r2);
    }
}
// input ->TjPGHTD4Fr26O1fciduz
// output-> TPHDF2Ofiu
/////////// jGT4r61cdz