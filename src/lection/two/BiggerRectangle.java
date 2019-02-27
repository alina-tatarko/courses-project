package lection.two;

import java.util.Scanner;

public class BiggerRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width 1");
        int width1 = scan.nextInt();
        System.out.println("Enter height 1");
        int height1 = scan.nextInt();
        System.out.println("Enter width 2");
        int width2 = scan.nextInt();
        System.out.println("Enter height 2");
        int height2 = scan.nextInt();
        if (width1 > 0 && height1 > 0 && width2 > 0 && height2 > 0) {
            if (width1 * height1 > width2 * height2) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        } else {
            System.exit(-1);
        }
    }
}
