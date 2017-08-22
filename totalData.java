/* Bailey Hosea
BCIS 3630
Monday class
Professor Guynes
Problem 8 
Challenge 3
Part 2
*/ 


// this program pulls information stored in personalData for each instance and returns the value for 
// the instance requested, then displays it

import javax.swing.JOptionPane;


public class totalData

{

   public static void main(String[] args)
   {
     String input;
     String anyName; // to hold a name
     String anyAddress; // to hold an address
     double anyAge;  // to hold an age
     double anyNumber;  // to hold a phone number
     
     
   // Create three instances
   
   personalData myInfo = new personalData();
   personalData friendsInfo = new personalData();
   personalData familyInfo = new personalData();
   
   anyName = JOptionPane.showInputDialog("Enter your name ");
   
   myInfo.setName(anyName);
   
   anyAddress = JOptionPane.showInputDialog("Enter your address ");
   
   myInfo.setAddress(anyAddress);
   
   input = JOptionPane.showInputDialog("Enter your age ");
   anyAge = Double.parseDouble(input);
   myInfo.setAge(anyAge);
   
   input = JOptionPane.showInputDialog("Enter your phone number ");
   anyNumber = Double.parseDouble(input);
   myInfo.setNumber(anyNumber);
   
   anyName = JOptionPane.showInputDialog("Enter your friend's name ");
   
   friendsInfo.setName(anyName);
   
   anyAddress = JOptionPane.showInputDialog("Enter your friend's address ");

   friendsInfo.setAddress(anyAddress);
   
   input = JOptionPane.showInputDialog("Enter your friend's age ");
   anyAge = Double.parseDouble(input);
   friendsInfo.setAge(anyAge);
   
   input = JOptionPane.showInputDialog("Enter your friend's phone number ");
   anyNumber = Double.parseDouble(input);
   friendsInfo.setNumber(anyNumber);
   
   anyName = JOptionPane.showInputDialog("Enter your mom's name ");

   familyInfo.setName(anyName);
   
   anyAddress = JOptionPane.showInputDialog("Enter their address ");

   familyInfo.setAddress(anyAddress);
   
   input = JOptionPane.showInputDialog("Enter their age ");
   anyAge = Double.parseDouble(input);
   familyInfo.setAge(anyAge);
   
   input = JOptionPane.showInputDialog("Enter their phone number ");
   anyNumber = Double.parseDouble(input);
   familyInfo.setNumber(anyNumber);
   
   // Display all of my information
   JOptionPane.showMessageDialog(null, "My name is " + myInfo.getName() + ", my address is " 
                                       + myInfo.getAddress() + ", my age is " + myInfo.getAge() +
                                       ", and my phone number is " + myInfo.getNumber() + ".");
   
   JOptionPane.showMessageDialog(null, "My friend's name is " + friendsInfo.getName() + ", his/her address is " 
                                       + friendsInfo.getAddress() + ", his/her age is " + friendsInfo.getAge() +
                                       ", and his/her phone number is " + friendsInfo.getNumber() + ".");
                                       
   JOptionPane.showMessageDialog(null, "My mom's name is " + familyInfo.getName() + ", their address is " 
                                       + familyInfo.getAddress() + ", their age is " + familyInfo.getAge() +
                                       ", and their phone number is " + familyInfo.getNumber() + ".");
                                       
                                       
   System.exit(0);
   
   }
}
   
   
   