// import the java utility Scanner to get input from the keyboard
import java.util.Scanner;
public class CW218_Johnson 
{

    public static void main(String[] args) 
    {
      /*System.out.println("ZNiyah"); 
      System.out.println("Johnson");
      System.out.print("Student"); 
      System.out.print("CIS 115");
       */
      
       // variables
       double num1, num2, num3, average;
       // declare a constant variable just because
       // Constant Real PI = 3.14
       final double PI = 3.14;
       // declare Scanner variable to get input from the keyboard
       Scanner keyboard = new Scanner(System.in);
       // get input
       System.out.print("Enter number one: ");
       num1 = keyboard.nextDouble();
       System.out.print("Enter number two: ");
       num2 = keyboard.nextDouble();
       System.out.print("Enter number three: ");
       num3 = keyboard.nextDouble();

       // calculations
       average = (num1 + num2 + num3) / 3;

       // output

       System.out.println("Average: " + average);
       // close the Scanner variable
       keyboard.close();
    }
}