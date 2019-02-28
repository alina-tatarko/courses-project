package lection.three.homework.zero;

import java.util.Arrays;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        int from = 2;
        int to = 7;
        printEvens(from, to);
    }

    public static void printEvens(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException();
        }
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}