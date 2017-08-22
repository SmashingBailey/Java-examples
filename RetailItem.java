/* Bailey Hosea
Problem 9 
Challenge 4
Part 1 of 2
Guynes
BCIS 3630 
Created on 11.23.2016
*/
import java.util.*;

public class RetailItem
{

      private String description;
      private int unitsOnHand;
      private double price;
      
      // constructor
      public RetailItem(String d, int u, double p)
      {
      description = d;
      unitsOnHand = u;
      price = p;
      }
      
      //Methods 
      
      public String getDescription()
      {
      return description;
      }
      
      public int getUnitsOnHand()
      {
      return unitsOnHand;
      }
      
      public double getPrice()
      {
      return price;
      }
      
      
      
      public void setDescription(String des)
      {
      description = des;
      }
      
      public void setUnitsOnHand(int units)
      {
      unitsOnHand = units;
      }
      
      public void setPrice(double cost)
      {
      price = cost;
      }
      
      
      
}