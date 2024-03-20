import java.util.Scanner;

public class Sales_Comm { //Sales Commission
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Sellers Name");
        String name = scanner.nextLine();

        System.out.println("Enter Sales ID");
         int ID = scanner.nextInt();

        System.out.println("Enter Sales Amt");
        int Amt = scanner.nextInt();

        System.out.println("Enter Basic Salary");
        double salary = scanner.nextDouble();

        double commission;


        if (Amt >= 50000){
            commission = (Amt * 35)/100;                                                        //35% comm if sales is and above 50000
            System.out.println("Your commission is 35% = " + commission );                     // finding the comm on sales first
            System.out.println("So Total salary including Basic salary and comm is " + (salary + commission));      // finding total salary assuming Basic salary + Comm i.e salary = Basic salary + Comm
        }

        else if (Amt >= 30000){
            commission = (Amt * 20)/100;                                                        //20% comm if sales is and above 30000
            System.out.println("Your commission is 20% = " + commission);
            System.out.println("So Total salary including Basic salary and comm is " + (salary + commission));
        }
        else if (Amt >= 20000){
            commission = (Amt * 10)/100;                                                        //15% comm if sales is and above 20000
            System.out.println("Your commission is 10% = " + commission);
            System.out.println("So Total salary including Basic salary and comm is " + (salary + commission));
        }
        else if (Amt >= 10000){
            commission = (Amt * 5)/100;                                                         //5% comm if sales is and above 10000
            System.out.println("Your commission is 5% = " + commission);
            System.out.println("So Total salary including Basic salary and comm is " + (salary + commission));
        }
        else {
            commission = (Amt * 2)/100;                                                         ////2% comm if sales is below 10000
            System.out.println("Your commission is 2% = " + commission);
            System.out.println("So Total including Basic salary and comm is " + (salary + commission));
        }





   }
}