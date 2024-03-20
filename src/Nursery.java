//Named nursery as Enter any value and the find out if it is number (0-9) or an alphabet or symbol
import java.util.Scanner;

public class Nursery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Alphabet/Number/Symbol");
        char input = scanner.next().charAt(0);                          //Character can hold symbols, numbers as well as alpha thats why just created one variable



        if(input >='a'  && input <='z' || input >='A'  && input <='Z'){
          System.out.println("You have entered an alphabet");

        }
        else if (input >= '0' && input <= '9') {                                 //bcz it is a char everything has to be in ' ' or else it wont work
            System.out.println("You have entered a number");
        }
        else{
            System.out.println("You have entered a Symbol");

        }

    }
}


