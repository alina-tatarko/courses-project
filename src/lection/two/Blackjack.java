package lection.two;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cardA");
        int cardA = scan.nextInt();
        System.out.println("Enter cardB");
        int cardB = scan.nextInt();
        if (cardA > 0 && cardB > 0) {
            if (cardA <= 21 && cardB <= 21) {
                if (cardA < cardB) {
                    System.out.println("You have " + cardB + " points");
                } else {
                    System.out.println("You have " + cardA + " points");}
                } else{
                    System.out.println("You have " + 0 + " points");
                }
            } else {
                System.exit(-1);
            }
        }
    }


