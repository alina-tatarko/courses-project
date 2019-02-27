package lection.two;

import java.util.Scanner;

public class EnterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = scan.nextInt();
        System.out.println("Enter number b");
        int b = scan.nextInt();
        if (a < b) {
            System.out.println("-1");
        } else if (a == b) {
            System.out.println("0");
        } else {
            System.out.println("+1");
        }
    }
}