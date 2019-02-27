package lection.two;

import java.util.Scanner;

public class BmiInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight Kg");
        double weight = (scan.nextDouble());
        System.out.println("Enter height M");
        double height = scan.nextDouble();
        double bmi = weight / height * 2;
        if (height < 0 || weight < 0) {
            System.exit(-1);
        } else {
            if (bmi <= 18.5) {
                System.out.println("Underweight");
            } else if (bmi > 18.5 && bmi <= 25.0) {
                System.out.println("Normal");
            } else if (bmi >= 25.0) {
                System.out.println("Overweight");
            }
        }
    }
}
