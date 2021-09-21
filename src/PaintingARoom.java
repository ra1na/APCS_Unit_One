import java.util.Scanner;

public class PaintingARoom {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter room length");
        int length = scan.nextInt();
        System.out.println("Enter room width");
        int width = scan.nextInt();
        System.out.println("Enter room height");
        int height = scan.nextInt();
        System.out.println("How many doors are in the room?");
        int doors = (15 * (scan.nextInt()));
        System.out.println("How many windows?");
        int windows = (10 * (scan.nextInt()));
        System.out.println("How many coats of paint?");
        int coats = scan.nextInt();
        int surfaceArea = (2 * ((length * width) + (width * height) + (length * height)));
        int totalFt = (surfaceArea) - (doors + windows);
        double gallons = (coats * (totalFt/350));
        int b = 10;
        int a = (int) (gallons * 10);
        int roundedGallons = ((a + b - 1) / b);
        System.out.print("You will need " + roundedGallons + " gallons of paint.");
    }
}
