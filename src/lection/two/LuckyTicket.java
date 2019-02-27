package lection.two;

import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ticket number 0 ... 999999");
        int ticket = scan.nextInt();
        if (ticket < 0 || ticket > 999999) {
            System.exit(-1);
        }
        String ticketNumber = String.valueOf(ticket);
        int numbers = ticketNumber.length();
        int zerosToAdd = 6 - numbers;

        for (int i = 0; i < zerosToAdd; ++i) {
            ticketNumber = "0" + ticketNumber;
        }
        int a = ticketNumber.charAt(0);
        int b = ticketNumber.charAt(1);
        int c = ticketNumber.charAt(2);
        int d = ticketNumber.charAt(3);
        int e = ticketNumber.charAt(4);
        int f = ticketNumber.charAt(5);
        boolean isLuckyTicket = ((a + b + c) == (d + e + f));

        if (isLuckyTicket) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
