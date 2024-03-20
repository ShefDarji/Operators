import java.util.Scanner;
public class AvgOfNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();

        System.out.println("Enter second number");
        int b = scanner.nextInt();

        System.out.println("Enter third number");
        int c = scanner.nextInt();

        System.out.println("Enter fourth number");
        int d = scanner.nextInt();

        System.out.println("Enter fifth number");
        int e = scanner.nextInt();


      int sum = a+b+c+d+e;
      int Avg = sum / 5;


        if (Avg>0 && Avg!=0){  // my avg should not be 0 and not even equal to 0 as well
        System.out.println("Avg of 5 numbers is = " + Avg);

        }

        else{
            System.out.println("Enter valid numbers as sum should be positive");

        }

  }
}