package lection.two;

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day 1..7");
        int day = scan.nextInt();
        if (day <= 7 && day >= 1) {
            if (day <= 5) {
                System.out.println("weekday");
            } else {
                System.out.println("weekend");
            }
        } else {
            System.out.println("day doesn't exist");
        }
    }
}

