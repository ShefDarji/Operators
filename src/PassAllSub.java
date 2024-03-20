import java.util.Scanner;
public class PassAllSub {

    // Pass all three subjects

    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter students name");
        String name = scanner.nextLine();

        System.out.println("Enter students Roll no");
        int number = scanner.nextInt();

        System.out.println ("Enter marks in Maths");
        int maths = scanner.nextInt();

        System.out.println ("Enter marks in English");
        int eng = scanner.nextInt();

        System.out.println ("Enter marks in Science");
        int sci = scanner.nextInt();



        if (maths>=35 && eng>=35 && sci>=35){                                     //have to clear all the subjects
         System.out.println("You have passed in Maths");
        }else{
            System.out.println("You have failed");
        }

    }

}
