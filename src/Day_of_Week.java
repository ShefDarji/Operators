import java.util.Scanner;

public class Day_of_Week {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        if (number ==1){                                                        //One week has 7 days i.e. we are allotting each number a day

          System.out.println("It is Sunday");
        }

      else if (number ==2){

            System.out.println("It is Monday");
        }

        else if (number ==3){

            System.out.println("It is Tuesday");
        }

        else if (number ==4){

            System.out.println("It is Wednesday");
        }

        else if (number ==5){

            System.out.println("It is Thursday");
        }

        else if (number ==6){

            System.out.println("It is Friday");
        }

        else if (number ==7){

            System.out.println("It is Saturday");
        }
        else {                                                                                    // days to find a week so anything more than 7 is not accepted
            System.out.println("Only 1 to 7 numbers are accepted as a week has 7 days.  Kindly enter numbers from 1 to 7 only");
        }



 }
}