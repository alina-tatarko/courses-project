package lection.three.homework.level0;

import java.util.Arrays;

public class PositiveElemIndexes {
    public static void main(String[] args) {
        int[] array = {1, 7, -3, 60, 0, -8};
        Arrays.sort(array);
        for (int n : array) {
            if (n >= 0) {
                System.out.println(Arrays.binarySearch(array, n));
            }
        }
    }
}
