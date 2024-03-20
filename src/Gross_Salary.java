import java.util.Scanner;
public class Gross_Salary {

public static void main (String []args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Employee Name");
    String EName = scanner.nextLine();                      //Ename means Employee name

    System.out.println("Enter Employee ID");
    int ID = scanner.nextInt();

    System.out.println("Enter Basic Salary");
    int Salary = scanner.nextInt();                         // Basic Salary


    double HRA = (Salary * 10) / 100;
    double DA = (Salary * 8) / 100;
    double TA = (Salary * 9) / 100;
    double PF = (Salary * 20) / 100;
    double GrossSalary = Salary + HRA + DA + TA - PF;                                      // declaring variable


    if (GrossSalary >10500 && Salary>=10000){                                               //basic salary of all employees is 10,000 in the company(Salary in Rs)

        System.out.println(EName+"'s" + " Gross Salary after deductions is " + GrossSalary);

    }
    else{

    System.out.println("Enter valid Details/Values");
    }

}

}
