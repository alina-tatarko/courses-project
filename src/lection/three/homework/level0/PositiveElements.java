package lection.three.homework.level0;

public class PositiveElements {
    public static void main(String[] args) {
        int[] array = {2, -4, 6, 11, -2, 8};
        for (int n : array) {
            if (n >= 0) {
                System.out.println(n);
            }
        }
    }
}
