import java.util.Scanner;

public class DateFormat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the current month?");
        String month = scan.nextLine();
        System.out.println("What is the day of the week?");
        int day = scan.nextInt();
        System.out.println("What is the year?");
        int year = scan.nextInt();
        System.out.println("What is the day of the month?");
        int dayMonth = scan.nextInt();

        System.out.println("American format:" +
                day, month, dayMonth, year);

    }
}

