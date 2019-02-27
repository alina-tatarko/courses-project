package lection.three.practice;

import java.util.Scanner;

public class FirstCakes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cakes number");
        int cakesNum = scan.nextInt();
        for (int a = 1; a <= cakesNum; a++) {
            System.out.println("I have eaten " + a + " cake");
        }
    }
}
