/* Bailey Hosea
Guynes 3630 
Problem 9
Challenge 1
Part 2
created on 11.23.2016
*/ 

public class Employee2
{
   public static void main(String[] args)
   
   {
   
   Employee box = new Employee("Susan Meyers", 47899, "Accounting", "Vice president");
   Employee box1 = new Employee("Mark Jones", 39119, "IT", "Programmer");
   Employee box2 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
   
   System.out.println("Name      ID Number      Department     Position");
   System.out.println("________________________________________________");
   
   System.out.println(" " + box.getName() + "  " + box.getID() + "  " + box.getDepartment() + "  " + box.getPosition());
   System.out.println(" " + box1.getName() + "  " + box1.getID() + "  " + box1.getDepartment() + "  " + box1.getPosition());
   System.out.println(" " + box2.getName() + "  " + box2.getID() + "  " + box2.getDepartment() + "  " + box2.getPosition());

   }
   
}
   