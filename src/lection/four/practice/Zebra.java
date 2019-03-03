package lection.four.practice;

import java.util.Arrays;

public class Zebra {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createZebra(4)));
        System.out.println(Arrays.toString(createZebra(5)));
    }

    public static String[] createZebra(int size) {
        String[] crZebra = new String[size];
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                crZebra[i] = "black";
            } else {
                crZebra[i] = "white";
            }
        }
        return crZebra;
    }
}

