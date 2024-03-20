import java.util.Scanner;

public class Vowels {

    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Alphabet");
        char alphabets = scanner.next().charAt(0);               //char as vowels only has a single alphabet


    if(alphabets == 'a' || alphabets == 'A' || alphabets == 'e' || alphabets == 'E' || alphabets == 'i' ||              //upper case as well as lower case to satisfy all conditions are met
            alphabets == 'I' || alphabets == 'o' || alphabets == 'O' ||alphabets == 'u' || alphabets == 'U' ){

        System.out.println("Input letter is Vowel");


        }

    else{
        System.out.println("Input letter is Consonant");

        }

    }

}
