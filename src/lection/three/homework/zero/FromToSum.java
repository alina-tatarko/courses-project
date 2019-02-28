package lection.three.homework.zero;

public class FromToSum {
    public static void main(String[] args) {
        int[] fromTo = {8, 12, 89, 5};
        //todo: fix this condition:
        if (fromTo.length > fromTo.length - 1) {
            throw new IllegalArgumentException("Illegal Argument Exception");
        } else {
            System.out.println(summery(fromTo));
        }
    }

    public static int summery(int[] fromTo) {
        int zero = 0;
        for (int elem : fromTo) {
            zero += elem;
        }
        return zero;
    }
}
