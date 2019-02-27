package lection.three.homework.level0;

public class AgeMethod {
    public static void main(String[] args) {
        int a = 18;
        int b = 168;
        boolean ageDef1 = age(a);
        boolean ageDef2 = age(b);
        System.out.println(ageDef1 + "\n" + ageDef2);
    }

    public static boolean age(int n) {
        boolean ageDef = (n >= 1 && n <= 120);
        return ageDef;
    }
}
