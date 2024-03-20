import java.util.Scanner;
public class Pass_03_Sub {

    public static void main (String []args){
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


         int total = maths+eng+sci;                              //calculate total marks obtained
        double percentage = (total* 100) /300;                  //calculate percentage

        System.out.println("Total marks scored are " + total);
        System.out.println("Secured " + percentage + "%");
                                                                                                    //Percentage and grade criteria
                                                                                                    // >= 80 A+
                                                                                                    // >= 60 A
                                                                                                    // >= 50 B
                                                                                                    // >= 35 C

    if(percentage>=80 && percentage<=100) {
        System.out.println("You have got A+ grade");
    }
            else if(percentage>=60){
        System.out.println("You have got A grade");
    }
            else if(percentage>=50){
        System.out.println("You have got B grade");
    }
            else if(percentage>=35){
        System.out.println("You have got C grade");
    }
            else{
            System.out.println("You have Failed");
    }

            }
            }
