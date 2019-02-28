package lection.three.homework.zero;

public class AgeMethod {
    public static void main(String[] args) {
        int a = 18;
        int b = 168;
        boolean ageDef1 = age(a);
        boolean ageDef2 = age(b);
        System.out.println(ageDef1 + "\n" + ageDef2);
    }

    public static boolean age(int n) {
        return (n >= 1 && n <= 120);
    }
}
