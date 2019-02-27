package lection.three.homework.level0;

public class LastCharMethod {
    public static void main(String[] args) {
        String a = "";
        if (a.isEmpty()) {
            throw new IllegalArgumentException("Illegal Argument Exception");
        } else {
            System.out.println(lastChar(a));
        }
    }

    public static char lastChar(String s) {
        return s.charAt(s.length() - 1);
    }
}
