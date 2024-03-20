import java.util.Scanner;

public class Upper_To_Lowercase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Uppercase Alphabet");      //the requirement says Upper to lower case i.e. why enter an Upper case
        char input = scanner.next().charAt(0);

        char input1;                                                // just declaring variable


 if (input >= 'A' && input <='Z') {

    input1=Character.toLowerCase(input);                            // changing input from upper to lower by using input1 variable and java formula
    System.out.println("Uppercase to Lowercase ans is " + input1);
    }
    else if (input >='a' && input <='z'){                               //requirement is Upper to lower

     System.out.println("Only uppercase alphabets are accepted");
 }
    else {                                                              //anything except alpha should be failed to accept
    System.out.print("Only alphabets are accepted");

 }

}

}