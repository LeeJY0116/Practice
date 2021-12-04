package project5;
import java.util.Scanner;
import java.util.Stack;
public class codeinspector {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        new Inspector(sc);
    	sc.close();
    }
}
class Inspector
{
	Scanner sc;
    Inspector(Scanner sc)
    {
    	int count = 0;
    	String input = "";
        Stack<Character> stack = new Stack<>();
        boolean quotation = true;
        boolean doublequo = true;
        boolean isIncorrect = false;
        loop1 :
        while(sc.hasNext() && !(input = sc.nextLine()).equals("") && count <= 9999)
        {
        	count++;
            int loopCount = 0;
            for (loopCount = 0; loopCount < input.length(); loopCount++)
            {
                char ch = input.charAt(loopCount);
         	    switch (ch) 
         	    {
                case '(': case '{': case '[':
                	if(quotation && doublequo)
                	{
                		stack.push(ch);	
                	}
           			break;
                case ')':
                	if(quotation && doublequo)
                	{
                		if(stack.isEmpty() || (ch = stack.pop()) != '(')
                			isIncorrect = true;
                	}
                    break;
                case '}':
                	if(quotation && doublequo)
                	{
                   		if (stack.isEmpty() || (ch = stack.pop()) != '{')
                   			isIncorrect = true;
                	}
               		break;
                case ']':
                	if(quotation && doublequo)
                	{
                   		if (stack.isEmpty() || (ch = stack.pop()) != '[')
                   			isIncorrect = true;
                	}
               		break;
                case '\'':
               	if (quotation && doublequo)
               	{
               		stack.push(ch);
               		quotation = false;
               	}
               	else if(!(quotation) && stack.isEmpty() || (ch = stack.pop()) != '\'')
           				isIncorrect = true;                			
               	else
           			quotation = true;
               	break;
                case '\"':
               	if (doublequo && quotation)
               	{
               		stack.push(ch);
               		doublequo = false;
               	}
               	else if(!(doublequo) && stack.isEmpty() || (ch = stack.pop()) != '\"')
                   		isIncorrect = true;
               	else
               		doublequo = true;
               	break;
         	    }
                if(isIncorrect)
                	break loop1;
     	    }
            if(isIncorrect || !(stack.isEmpty()) ) 
                break;
        }   
        if(isIncorrect || !(stack.isEmpty()))
            System.out.println("NG " + count);
        else
    		System.out.println("OK");
    }
}