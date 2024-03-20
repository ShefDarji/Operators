import java.util.Scanner;

public class Leap_Year {

    public static void main(String[] args) {
        System.out.println("Enter a year");

        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        if (number%4==0 || number%400==0) {

            System.out.println("It is a leap year");
        } else {

            System.out.println("It is not a leap year");
        }
    }
}