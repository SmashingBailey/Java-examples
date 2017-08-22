import java.util.*;

public class payrollDemo
{

   static Scanner in = new Scanner(System.in);
   
   public static void main(String args[]) // the main 
      {
      Payroll pay = new Payroll(); // to pull from the payroll class
      pay.inputHoursPayrate(); // calls the method inputHoursAndPayrate
      pay.displayGrossWage(); // calls the method displayGrossWage
      System.out.println("Enter the employee ID for which you want to see the Wages ");
      
      int search = in.nextInt();
      double wage = pay.returnWage(search); 
      
      if(wage != 0)
      System.out.println("Gross Wage for employee # " + search + " is $" + wage);
      
      else if(wage == 0)
      System.out.println("The employee ID wasn't found"); 
      }
}