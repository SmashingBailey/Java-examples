/* Bailey Hosea
Problem 7 
Challenge 9
Guynes
Monday class
BCIS 3630
Created on 10/25/2016
*/

import java.util.Scanner;

public class challenge9

{

   public static void main(String[] args)
   
   {
   
      double speed;
      double time;
      double distance;
      speed = getSpeed();
      time = getTime();
      distance = displayDistance(speed,time);
      
   }
   
   public static double getSpeed()
   
   {
   double speed;
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Enter the Speed in MPH ");
   speed = keyboard.nextDouble();
   
   
   if (speed < 0)
   {
   System.out.println("The speed can not be a negative value");
   }
   
   return speed;
   
   
   
   }
   
   public static double getTime()
   
   {
   
   double time;
   
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Enter the time traveled in hours ");
   time = keyboard.nextDouble();
   
   return time;
   
   }
   
   public static double displayDistance(double time,double speed)
   
   {
   
   double distance;
   
   distance = speed * time;
   
   System.out.println("The distance traveled is " + distance);
   
   return distance;
   
   }
   
}
   
