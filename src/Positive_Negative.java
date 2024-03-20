import java.util.Scanner;
public class Positive_Negative {

    public static void main (String []args){

    Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number");

        int number = scanner.nextInt();


     if (number>0){                                       //more than 0 i.e. positive

        System.out.println("It is a positive number");

    }

     else if (number!=0) {                               //Not equal to 0
        System.out.println("It is a negative number");
    }

    else {
        System.out.println("It is Zero number");
    }


    }

}
