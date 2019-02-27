package lection.one;

public class DigitsPrinter {
    public static void main(String[] args) {
        int numberMain = 13569;
        int numberMain2 = 24;
        int numberMain3 = 987654321;
        printFiveLastDigits(numberMain);
        printFiveLastDigits(numberMain2);
        printFiveLastDigits(numberMain3);
    }

    public static void printFiveLastDigits(int number) {
        int digit1 = number % 10;
        number /= 10;
        int digit2 = number % 10;
        number /= 10;
        int digit3 = number % 10;
        number /= 10;
        int digit4 = number % 10;
        number /= 10;
        int digit5 = number % 10;

        System.out.println(digit5 + "\n" + digit4 + "\n" + digit3 + "\n" + digit2 + "\n" + digit1 + "\n");
    }
}
