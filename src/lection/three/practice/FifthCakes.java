package lection.three.practice;

import java.util.Scanner;

public class FifthCakes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cakes");
        int cakesNum = scan.nextInt();
        System.out.println("Enter people");
        int peopleNum = scan.nextInt();
        for (int n=1; n<=peopleNum; n++){
            for (int a = 1; a <= cakesNum; a++) {
                System.out.print("I'm a person number " + n + ". ");
                System.out.println("I have eaten " + a + " cake");
            }
        }

    }
}
