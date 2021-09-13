import java.util.Scanner;

public class CorrectChange {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        int cents;

        System.out.print("Enter the whole number of cents");
        cents = scan.nextInt();
        if (cents/100 >= 1) {
            dollars =+ 1;
            cents = (cents/100)
        }



//        double dollars = (0.25 * quarters) + (0.10 * dimes) + (0.05 * nickels) + (0.01 * pennies);

        System.out.println();
        System.out.print("You have ");
        System.out.println();


    }
}
