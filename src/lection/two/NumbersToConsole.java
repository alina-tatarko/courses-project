package lection.two;

import java.util.Scanner;

public class NumbersToConsole {
    public static void main(String[] args) {
        for (int a = 10; a <= 30; ++a) {
            System.out.print(a);
        }

        System.out.println("\n");
        for (int b = 20; b >= -10; --b) {
            System.out.print(b);
        }

        System.out.println("\n");
        for (int c = 10; c <= 100; c += 10) {
            System.out.print(c);
        }

        System.out.println("\n");
        for (int d = 300; d >= -200; d -= 50) {
            System.out.print(d);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Enter number From");
        int from = scan.nextInt();
        System.out.println("Enter number To");
        int to = scan.nextInt();
        for (int a = from; a <= to; ++a) {
            System.out.print(from);
        }
    }
}
