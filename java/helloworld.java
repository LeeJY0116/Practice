package ljy;

import java.util.Scanner;

public class helloworld 
{	
   public static void main(String[] args) 
   {
      Scanner scan = new Scanner(System.in);
      char letter1[] = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ', '~', '!', '^' };
      char letter2[] = new char[] { 'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a', ' ', '~', '!', '^' };
      char letter3[] = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '~', '!', '^' };
      char letter4[] = new char[] { 'Z', 'Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R', 'Q', 'P', 'O', 'N', 'M', 'L', 'K', 'J', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A', ' ', '~', '!', '^' };
      while(scan.hasNext())
      {      
    	  String a = scan.nextLine();
          Coding code = new Coding(a, letter1, letter2, letter3, letter4);
      }

   }
}
class Coding
{
    Coding(String a, char[] letter1, char[] letter2, char[] letter3, char[] letter4)
    {
    	for (int i = 0; i <a.length(); i++) 
        {
           for (int j = 0; j < letter1.length; j++) 
           {
              if (a.charAt(i) == letter1[j]) 
              {
                 System.out.print(letter2[j]); 
              }
              else if (a.charAt(i) == letter3[j]) 
              {
                 System.out.print(letter4[j]); 
              }
           }
        }
    }
}