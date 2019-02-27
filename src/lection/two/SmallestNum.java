package lection.two;

import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = scan.nextInt();
        System.out.println("Enter number b");
        int b = scan.nextInt();
        System.out.println("Enter number c");
        int c = scan.nextInt();

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println(min + " is the smallest number");
    }
}
