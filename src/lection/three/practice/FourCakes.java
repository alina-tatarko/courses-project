package lection.three.practice;

import java.util.Scanner;

public class FourCakes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cakes number");
        int cakesNumber = scan.nextInt();
        System.out.println("Enter border cake");
        int borderCake = scan.nextInt();
        for (int a = 1; a <= cakesNumber; a++) {
            System.out.println("I have eaten " + a + " cake");
            if (a >= borderCake) {
                System.out.println("I'm feeling bad.");
            }
        }

    }
}
