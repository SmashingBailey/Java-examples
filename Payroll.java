/* Bailey Hosea
professor Guynes
monday class
BCIS 3630
Problem 8 
challenge 5
created on 11/15/2016
*/ 

// this class is designed to create fields for employee's name, ID#, hourly pay rate, and hours worked. 

public class Payroll

{

   private String name; // for the employees name
   private double idNumber; // employees ID number
   private double hourlyPay; // The amount the employee makes per hour
   private double hoursWorked; // the amount of hours worked
   private double grossPay; // calculated gross pay
   
   public Payroll(String anyName, double anyID)
   {
   anyName = name;
   anyID = idNumber;
   }
   
   public void setName(String employeeName)
   {
   name = employeeName;
   }
   
   public void setID(double employeeID)
   {
   idNumber = employeeID;
   }
   
   public void setPay(double employeePay)
   {
   hourlyPay = employeePay;
   }
   
   public void setHours(double employeeHours)
   {
   hoursWorked = employeeHours;
   }
   
   public String getName()
   {
   return name;
   }
   
   public double getidNumber()
   {
   return idNumber;
   }
   
   public double gethourlyPay()
   {
   return hourlyPay;
   }
   
   public double gethoursWorked()
   {
   return hoursWorked;
   }
   
   public double getgrossPay()
   {
   grossPay = hourlyPay * hoursWorked;
   return grossPay;
   }
   
}