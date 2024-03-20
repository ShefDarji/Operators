import java.util.Scanner;
public class Calculation {
    public static void main (String []args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter value of a");
    double a = scanner.nextDouble();

    System.out.println("Enter value of b");
    double b = scanner.nextDouble();

    System.out.println("Enter either one of Arithmetic Operator(+,-,*,/)");
    char operator = scanner.next().charAt(0);
    double ans;

    if(operator =='+'){                                                         //taking addition as an operator
    System.out.println("This is addition");
        System.out.println("Total of your number is " + (ans = a + b));

    }
    else if(operator =='-') {                                                   //taking subtraction as an operator
        System.out.println("This is subtraction");
        System.out.println("Total of your number after subtraction is " + (ans = a - b));
    }

    else if(operator =='/') {
        System.out.println("This is division");                                    //taking division as an operator
        System.out.println("Division of both the numbers is " + (ans = a / b));
    }

    else if (operator =='*'){
        System.out.println("This is multiplication");                              //taking multiplication as an operator
        System.out.println("Total of your number after multiplication is " + (ans = a * b));
    }
    else{
        System.out.println("Please enter valid operator");                              //% should not work
    }



    }
    }