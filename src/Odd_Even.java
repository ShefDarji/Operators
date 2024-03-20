import java.util.Scanner;
public class Odd_Even {
    //finding odd or even using ternary operators ? :
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     System.out.println("Please enter the number - ");

    int number = scanner.nextInt();


     String ans = (number%2==0) ? "It is even number" : "It is odd number" ;              //using ternary operator instead of if else and we need to use string as statement is printout out

        System.out.println( ans);

    }


}
