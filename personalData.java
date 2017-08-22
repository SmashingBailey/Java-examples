/* Bailey Hosea
Problem 8 
Challenge 3
Professor Guynes
Monday Class
BCIS 3630
11.14.2016
*/ 


// this class was created to hold name, address, age, and phoneNumber

public class personalData

{
   private String name;
   private String address;
   private double age;
   private double phoneNumber;
   
   public void setName(String myName)
   {
   name = myName; 
   }
   
   public void setAddress(String myAddress)
   {
   address = myAddress;
   }
   
   public void setAge(double myAge)
   {
   age = myAge;
   }
   
   public void setNumber(double myNumber)
   {
   phoneNumber = myNumber;
   }
   
   public String getName()
   {
   return name;
   }
   
   public String getAddress()
   {
   return address;
   }
   
   public double getAge()
   {
   return age;
   }
   
   public double getNumber()
   {
   return phoneNumber;
   }
   
}