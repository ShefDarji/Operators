import java.util.Scanner;

public class Vote {

    public static void main(String[]args) {
        System.out.println("Enter an age");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age>=18){ //18 or above 18
        System.out.println("You are eligible to vote");
        }

        else{
        System.out.println("You are not eligible to vote");
        }

    }
}
