import java.util.Scanner;

public class City_Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Alphabet from A to F");
        char alphabet = scanner.next().charAt(0);

        String a = "Aberdeen";
        String b = "Birmingham";
        String c = "Cambridge";
        String d = "Doncaster";
        String e = "Edinburgh";
        String f = "Feltham";

        if (alphabet == 'a' || alphabet == 'A' ){  // individually checking the input char is meeting the condition or not

            System.out.println("You have entered " + a  +" city name");

        }
        else if (alphabet == 'b' || alphabet == 'B' ){

            System.out.println("You have entered " + b  +" city name");

        }
        else if (alphabet == 'C' || alphabet == 'c' ){

            System.out.println("You have entered " + c  +" city name");

        }
        else if (alphabet == 'D' || alphabet == 'd' ){

            System.out.println("You have entered " + d  +" city name");

        }
        else if (alphabet == 'E' || alphabet == 'e' ){

            System.out.println("You have entered " + e  +" city name");

        }
        else if (alphabet == 'F' || alphabet == 'f' ){

            System.out.println("You have entered " + f  +" city name");

        }
        else {                                                                  //anything apart from a to f is not accepted

            System.out.println("Enter Valid Alphabet");
        }


    }
}