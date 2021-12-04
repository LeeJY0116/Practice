package project1;

import java.util.Scanner;

public class °úÁ¦2_1 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int innumber = sc.nextInt();
		int countnum = 0;
		int total;
		int[] num = new int[innumber+1];
		

		for(int i = 1; i < innumber+1; i++) 
		{
			num[i]=sc.nextInt();
			if(num[i] >= 100) 
				countnum++;
			else if(num[i] + num[i-1] >= 100)
				countnum++;

		}

		
		System.out.println(countnum);
	}
}



