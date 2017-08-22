/* Bailey Hosea
BCIS 3630
Professor Guynes
Problem 9 
Challenge 1
created on 11/23/2016

employee class with constructors and methods : Class 1 of 2
*/

public class Employee
{     
      // fields
      private String name; // to hold name
      private int idNumber;        // to hold id number
      private String department; // to hold department
      private String position;  // to hold position
      

      //constructors
      public Employee(String employeeName, int employeeID, String employeeDepartment, String employeePosition)
      {
      name = employeeName;
      idNumber = employeeID;
      department = employeeDepartment;
      position = employeePosition;
      }
      
      public Employee(String employeeName, int employeeID)
      {
      name = employeeName;
      idNumber = employeeID;
      department = " ";
      position = " ";
      }
      
      public Employee()
      {
      name = " ";
      idNumber = 0;
      department = " ";
      position = " ";
      }
      
      //methods
      public String getName()
      {
      return name;
      }
      
      public int getID()
      {
      return idNumber;
      }
      
      public String getDepartment()
      {
      return department;
      }
      
      public String getPosition()
      {
      return position;
      }
      
}
      
      
      
      
      
      