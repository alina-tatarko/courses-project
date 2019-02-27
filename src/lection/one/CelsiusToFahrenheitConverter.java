package lection.one;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        double celsius = 0.0;
        double celsius2 = 20.0;
        System.out.println(celsius + " °C -> " + convert(celsius) + " °F");
        System.out.println(celsius2 + " °C -> " + convert(celsius2) + " °F");
    }

    public static double convert(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        return fahrenheit;
    }
}
