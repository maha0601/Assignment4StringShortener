/* Mahaluxmy Thambabely 
  November 15,2023
  This program takes a message and removes vowels and letters that
  repeat. Then rewrites the message and tells you how many characters 
  you saved. For algorithm 1. For algorithm 2, it takes the same
  message and tells you how many unique characters there are, then
  rewrites the message and tells you how many characters you have save.
*/
import java.util.Scanner;

class Assignment4 
{
  public static void main(String[] args) 
  {
   // Declare the String 
   Scanner scan=new Scanner(System.in); 
   
   // User Will Enter the Message 
   System.out.println("Type the message to be shortened");
   
   // Changes the Message to Lower Case 
   String message = scan.nextLine().toLowerCase(); 
   // Declares the Variables 
   
   int index=message.length();
   int count=0;
   int noVowels=0;
   int noRepeats=0;
   String newString="";
   // While Loop for When Count is Less Then Index 
   
   while(count<index)
   {
      if(count==0)
   { 
      newString += message.charAt(count);
      count++;
   }
     else if(message.charAt(count-1)==' ')
     {
        newString += message.charAt(count);
        count++;
    }
      else if(message.charAt(count-1)==message.charAt(count)&&(message.charAt(count)!='a'&&message.charAt(count)!='e'&&message.charAt(count)!='i'&&message.charAt(count)!='o'&&message.charAt(count)!='u'))
    {
        noRepeats++;
        count++;
      
    }
  // Else Loop to Calculate the Number of Vowels 
  else
  {
    if(message.charAt(count)!='a'&&message.charAt(count)!='e'&&message.charAt(count)!='i'&&message.charAt(count)!='o'&&message.charAt(count)!='u')
    {
      newString+=message.charAt(count);
      count++;
        
    }
      else
      {
        noVowels++;
        count++;
        
      }
      
    }
    
   }
   // Prints Out the First Algorithm
   
   System.out.printf("\nAlgorithm 1\nVowels removed: %d\nRepeats removed: %d\nAlgorithm 1 message: %s\nAlgorithm 1 characters saved: %d\n",noVowels,noRepeats,newString,(noRepeats+noVowels));
   // Declaring More Variables
   
   index=0;
   count=0;
   char lol=' ';
   String message2 = message;
   message = message.replaceAll(" ","");
   newString = "";
   // For Loop of the Amount of Characters Saved 
   
   for(int i=0;i<message.length();i++)
   {
     count=0;
     lol=message.charAt(i);
     if(newString.indexOf(lol)==-1)
     {
       for(int x=0;x<message.length();x++)
     {
        if(message.charAt(x)==lol)
     { 
          count++;
       
     }
     
    }
      newString+=count+""+lol;
      index++;
    
     }
     
   }
   // Prints Out the Second Algorithm
   
   System.out.printf("\nAlgorithm 2\nUnique characters found: %d\nAlgorithm 2 message: %s\nAlgorithm 2 characters saved: %d",index,newString,(message2.length()-newString.length()));
  }
}
