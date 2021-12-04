package project1;

import java.util.Scanner;

public class °úÁ¦2 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int innumber = sc.nextInt();
		int countnum = 0;
		int total;
		int[] num = new int[innumber];
		

		for(int i = 0; i < innumber; i++) 
		{
			num[i]=sc.nextInt();
			if(num[i] >= 100) 
			{
				countnum++;
			}
		}
		for(int j = 0; j < innumber; j += 2) {
			
			total = num[j] + num[j];
			if(total>=100) 
			{
				countnum++;
			}
		}
		
		System.out.println(countnum);
	}
	
}


