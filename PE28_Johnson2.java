import java.util.Scanner;
public class PE28_Johnson2 
{

    public static void main(String[] args) 
    {
        System.out.println("Programming Exercise 2-8");
        // variables
        Scanner k = new Scanner(System.in);
        double food, tip, tax, total;
        final double TAX_RATE = .07;
        final double TIP_RATE = 0.15;

        // input
        System.out.print("Enter the charge for food: ");
        food = k.nextDouble();

        tip = food * TIP_RATE;
        tax = food * TAX_RATE;
        total = food + tax + tip;

        // output

        System.out.println("Tip: $" + String.format("%,.2f",tip));
        System.out.println("Tax: $" + String.format("%,.2f",tax));
         System.out.println("Total: $" + String.format("%,.2f",total));

    }
}