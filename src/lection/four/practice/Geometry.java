package lection.four.practice;

public class Geometry {
    public static void main(String[] args) {
        System.out.println(rectangleArea(20, 10));
        System.out.println(rectangleArea(20, 30));

        System.out.println(circleArea(10));
        System.out.println(circleArea(20));
        System.out.println(circleArea(-10));
    }

    private static double rectangleArea(double height, double width) {
        if (height <= 0 || width <= 0) {
            throw new IllegalArgumentException("Height and width less or equals zero");
        }
        return height * width;

    }

    private static double circleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius less or equals zero");
        }
        double radiusPow = Math.pow(radius, 2);
        return Math.PI * radiusPow;

    }
}