package lection.three.homework.zero;

public class FromToSum {
    public static void main(String[] args) {
        int from = 6;
        int to = 4;
        System.out.println(rangeSum(from, to));
    }

    public static int rangeSum(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException();
        }
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }
}
