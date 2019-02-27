package lection.two;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month 1 ... 12");
        int month = scan.nextInt();
        if (month <= 0 || month >= 12) {
            System.exit(-1);
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    int days = 31;
                    System.out.println(days);
                    break;
                case 2:
                    days = 28;
                    System.out.println(days);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    System.out.println(days);
                    break;
            }
        }
    }
}
