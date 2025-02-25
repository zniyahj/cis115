 /*
  * Johnson
  * M3Hw1_Widgets
  * 2-25-2025
  * This program is the java code for the Module 3 Widget problem
  */

  // need to import the java utility called Scanner to ge input from the keyboard

  import java.util.Scanner;
  public class M3HW1Johnson 
  {
  
    public static void main(String[] args) 
    {
        // Pseudocode will be written first followed by the java code
        // Pseudocode is not recognixed by the compiler
        // declare variables
        // Declare Integer quarter1, quarter2, quarter3, quarter4, annual Widgets
        // java code
        Integer quarter1, quarter2, quarter3, quarter4, annualWidgets;
        // Declae Real salesAmount, salesTax, totalAmount = 0
        // java code
        double salesAmount, salesTax, totalAmount;
        // Constant Real WIDGET_COST = 4.79
        // Constant Real TAX = .07
        // java code
        final double WIDGET_COST = 4.79; // final is java reserved word
        final double TAX = .07;
        // declare a variable to get input from the keyboard
        // used in conjunction with the import java.util.Scanner command
        // here we declare a keyboard variable using the Scanner utility
        // to get input from the keyboard
        // java code
        Scanner keyboard = new Scanner(System.in) ;
        // input
        // Display "Enter sales for quarter one: "
        // Input quarter 1
        // Display "Enter sales for quarter two: "
        // Input quarter 2
        // Display "Enter sales for quarter three: "
        // Input quarter 3
        // Display "Enter sales for quarter four: "
        // Input quarter 4
        // java code
        System.out.print("Enter sales for quarter one: ");
        quarter1 = keyboard.nextInt();
        System.out.print("Enter sales for quarter two: ");
        quarter2 = keyboard.nextInt();
        System.out.print("Enter sales for quarter three: ");
        quarter3 = keyboard.nextInt();
        System.out.print("Enter sales for quarter four: ");
        quarter4 = keyboard.nextInt();
        // calculations
        // Set annualWidgets = quarter1 + quarter2 + quarter3 + quarter 4
        // Set salesAmount = annualWidgets * WIDGET_Cost
        // Set salesTax = salesAmount * TAX
        // Set totalAmount = salesTax + salesAmount
        // java code
        annualWidgets = quarter1 + quarter2 + quarter3 + quarter4;
        salesAmount = annualWidgets * WIDGET_COST;
        salesTax = salesAmount * TAX;
        totalAmount = salesTax + salesAmount;
        // output
        // Display "Annual Widgets Sold: ", annualWidgets
        // Display "Widgets Sales Amount: ", salesAmount
        // Display "Sales Tax Collected: ", salesTax
        // Display "Total Amount: ", totalAmount
        //java code
        // notice i used println() here
        // notice i used a + instead of a ,
        System.out.println("Annual Widgets Sold: " + annualWidgets);
        System.out.println("Widgets Sales Amount: " + salesAmount);
        System.out.println("Sales Tax Collected: " + salesTax);
        System.out.println("Total Amount: " + totalAmount);


    }
  }