package project2;

import java.util.Scanner;

public class °úÁ¦3_1 
{

	public static void main(String[] args) 
	{
		Yaongi clYaongi = new Yaongi();
		Scanner sc = new Scanner(System.in);
		
		int nuserinput = sc.nextInt();
		int[] nnum = new int[nuserinput];
		for(int i = 0; i < nuserinput; i++)
		{
			nnum[i]=sc.nextInt();
		}
		clYaongi.Meow(nnum, nuserinput);
	
	}
}

class Yaongi 
{
	void Meow(int[] nnum, int nuserinput)
	{
		int ncount = 0;
		for(int k = 0; k < nuserinput; k++)
		{
			if(nnum[k] == 3)
			{
				System.out.print("Mung");
				ncount++;
				if(ncount == 3)
				{
					break;
				}
			}
			for(int j = 0; j < nnum[k]; j++)
			{
				if(nnum[k] != 3)
				{
					System.out.printf("Meow");
				}
			}
			System.out.println();
		}
		
	}
}


