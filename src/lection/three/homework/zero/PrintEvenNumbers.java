package lection.three.homework.zero;

import java.util.Arrays;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        int[] elems = {9, 22, 1, 7, 30};
        PrintEvens(elems);
    }

    public static void PrintEvens(int[] fromTo) {
        for (int even : fromTo) {

            System.out.println(Arrays.toString(fromTo));
        }
    }
}