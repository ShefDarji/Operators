import java.util.Scanner;

public class Interchanged_values {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a variable x or y");
        char variable = scanner.next().charAt(0);

        int x = 10;
        int y = 20;
        int z;                          //temporary variable


         z = x;
         x = y;
         y = z;


         if (variable=='x') {

             System.out.println("Value of x after swapping is " + x);

         } else if (variable=='y') {
             System.out.println("Value of y after swapping is " + y);
         }
          else {
             System.out.print("Enter valid variable");


         }

 }

}
