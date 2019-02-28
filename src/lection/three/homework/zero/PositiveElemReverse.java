package lection.three.homework.zero;

import java.util.Collections;

public class PositiveElemReverse {
    public static void main(String[] args) {
        int[] array = {-4, 9, 2, 0, -1, 89, -12, 17, 31, -8, 142};
        for (int n = array.length - 1;n>=0; n--) {
            if (array [n] >=0)
                System.out.println(array[n]);
        }
    }
}
