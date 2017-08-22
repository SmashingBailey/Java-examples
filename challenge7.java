/* Bailey Hosea
Problem 7
Chapter 5
Challenge 7
Professor Guynes
Monday Class
BCIS 3630
Created on 10/25/2016
*/ 

import java.util.Scanner;

public class challenge7

{

   public static void main(String[] args)
   
   {
      Scanner keyboard = new Scanner(System.in);
   
      double score1;
      double score2;
      double score3;
      double score4;
      double score5;
      double average;
      double letter;
      
     
      
      
      
      System.out.println("Enter test score 1 ");
      score1 = keyboard.nextDouble();
      
      System.out.println("Enter test score 2 ");
      score2 = keyboard.nextDouble();
      
      System.out.println("Enter test score 3 ");
      score3 = keyboard.nextDouble();
      
      System.out.println("Enter test score 4 ");
      score4 = keyboard.nextDouble();
      
      System.out.println("Enter test score 5 ");
      score5 = keyboard.nextDouble();
      
      average = calcAverage(score1,score2,score3,score4,score5);
      letter = determineGrade(average);
      
      
   }
   
      public static double calcAverage(double score1,double score2, double score3,double score4,double score5)
   
      {
      double average;
      
      average = (score1 + score2 + score3 + score4 + score5) / 5;
      
      return average;
      }
      
      
      
      public static char determineGrade(double average)
      
      {
      
      char letter;
      
      if (average >= 90)
      {
      letter = 'A';
      }
      else if (average >= 80)
      {
      letter = 'B';
      }
      else if (average >= 70)
      {
      letter = 'C';
      }
      else if (average >= 60)
      {
      letter = 'D';
      }
      else 
      {
      letter = 'F';
      }
      
      System.out.println("The average test grade is " + average + " and the letter grade is " + letter);
      
      return letter;
      
      
      }
      
}
      
      
      