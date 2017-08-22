/* Bailey Hosea
Problem 9 
Challenge 4
Part 2 of 2
Guynes
BCIS 3630
Created on 11.23.16
*/ 

import java.util.*;

public class RetailItemStored

{

      public static void main(String[] args)
      {
     
      RetailItem box = new RetailItem ("Jacket", 12, 59.95);
      RetailItem box1 = new RetailItem ("Designer Jeans", 40, 34.95); 
      RetailItem box2 = new RetailItem ("Shirt", 20, 24.95);
      
      System.out.println("       Description       Units on Hand        Price");
      System.out.println("___________________________________________________");
      System.out.println("Item #1 " + box.getDescription() + "  " + box.getUnitsOnHand() + "  " + box.getPrice());
      System.out.println("Item #2 " + box1.getDescription() + "  " + box1.getUnitsOnHand() + "  " + box1.getPrice());
      System.out.println("Item #3 " + box2.getDescription() + "  " + box2.getUnitsOnHand() + "  " + box2.getPrice());
      
      }
      
}
                                   
                                    
      