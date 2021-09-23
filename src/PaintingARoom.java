import java.util.Scanner;

public class PaintingARoom {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter room length");
        double length = scan.nextDouble();
        System.out.println("Enter room width");
        double width = scan.nextDouble();
        System.out.println("Enter room height");
        double height = scan.nextDouble();
        System.out.println("How many doors are in the room?");
        int doors = (15 * (scan.nextInt()));
        System.out.println("How many windows?");
        int windows = (10 * (scan.nextInt()));
        System.out.println("How many coats of paint?");
        final int coats = scan.nextInt();
        double wall1 = (length * height);
        double wall2 = (width * height);
        double ceiling = (length * width);
        double surfaceArea = (2 * wall1) + (2 * wall2) + ceiling;
        double totalFt = (surfaceArea) - (doors + windows);
        double gallons = (coats * (totalFt/350));
        int b = 10;
        int a = (int) (gallons * 10);
        int roundedGallons = ((a + b - 1) / b);
        System.out.print("You will need " + roundedGallons + " gallons of paint.");
    }
}
