package Diy;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Monaliza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String text = sc.nextLine();

        ArrayList<Word> words = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            char c = text.charAt(i);
            Word word = new Word(n, c);
            words.add(word);
        }
        Collections.sort(words);
        for (int i = 0; i < num; i++) {
            System.out.print(words.get(i).character);
        }
    }
}

class Word implements Comparable<Word> {
    int number;
    char character;

    public Word(int number, char character) {
        this.number = number;
        this.character = character;
    }

    @Override
    public int compareTo(Word x) {
        return this.number - x.number;
    }
}