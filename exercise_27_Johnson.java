import java.util.Scanner;

public class exercise_27_Johnson 
{

    public static void main(String[] args) 
    {
        // Declare variables to hold miles driven, gallons
        // of fuel used, and mpg.
        Scanner in = new Scanner(System.in);
        double miles, gallons, mpg;
     // Get the miles driven.
     System.out.print("Enter the miles driven: ");
        miles = in.nextDouble();
        // Get the gallons of fuel used.
        System.out.print("Enter the gallons of fuel used: ");
        gallons = in.nextDouble();

    // Calculate the miles-per-gallon.
    mpg = miles / gallons;

    // Display the result
    System.out.println("You drove " + String.format("%,.2f",mpg) + " miles per gallon");
    in.close();

    }
}