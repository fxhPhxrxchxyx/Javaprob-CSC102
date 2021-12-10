package Diy;

import java.util.Scanner;
import java.util.HashMap;

public class HashApple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> apple = new HashMap<String, Integer>();

        while (true) {
            String person = sc.next();

            if (person.equals("0")) {
                break;
            }
            int volum = sc.nextInt();
            if (apple.containsKey(person)) {
                apple.put(person, apple.get(person) + volum);
            } else {
                apple.put(person, +volum);
            }

        }
        String target = sc.next();
        System.out.println(apple.get(target));
    }

}
// input
// A 3
// B 3
// A -2
// 0
// A

// output
// 1