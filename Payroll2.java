/*Bailey Hosea
professor Guynes
BCIS 3630
monday class
*/

import javax.swing.JOptionPane;   //Needed for Scanner class. 

public class Payroll2

{

    public static void main(String[] args)

    {
        String input;
        String employeeName;
        double employeeNumber;
        double hoursWorked;
        double hourlyPay;      
        double employeePay;
        
                

        employeeName = JOptionPane.showInputDialog("Enter emplyee's name ");
   
   
        input = JOptionPane.showInputDialog("Enter employee's ID number ");
        employeeNumber = Double.parseDouble(input);
        
        //Create a payroll object, passing EmployeeName and IDnumber
        // as arguments to the constructor.

        Payroll pay = new Payroll(employeeName, employeeNumber);

   
        input = JOptionPane.showInputDialog("Enter employee's hourly pay rate ");
        hourlyPay = Double.parseDouble(input);
        pay.setPay(hourlyPay);
   
        input = JOptionPane.showInputDialog("Enter amount of hours worked by employee ");
        hoursWorked = Double.parseDouble(input);
        pay.setHours(hoursWorked);
        
        
         
        //Get the employee's name.

        //Get the Gross Pay of the employee.

        JOptionPane.showMessageDialog(null, "The gross pay of " + employeeName + " is " + pay.getgrossPay());
        
        System.exit(0);

    }

}
