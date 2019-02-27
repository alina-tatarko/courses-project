package lection.three.practice;

import java.util.Scanner;

public class SecondCakes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cakes number");
        int cakesNum = scan.nextInt();
        System.out.println("I have " + cakesNum + " cakes");
        for (int a = cakesNum - 1; a >= 0; a--) {
            System.out.println("I have eaten a cake. " + a + " are left.");
        }

    }
}
