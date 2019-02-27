package lection.two;

import java.util.Scanner;

public class RangeDef {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scan.nextInt();
        if (num <= 200 & num >= 100) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
