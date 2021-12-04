package practice1;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		int x = sc.nextInt();
		int a = 0;
		int b = 0;
		int n = sc.nextInt();
		int y = sc.nextInt();
		int t = sc.nextInt();

		for(int i = 1; i < t + 1 ; i ++)
		{
			a += x;
			b += x;
			if(b >= n && (x - y) >= 0)
			{
				while(n <= b)
				{
					if((x - y) < 0)
						break;
					else
					{
						x -= y;
						b -= n;
					}
				}
			}
		}
		int r = (a) % (n * 2);
		
		if
		(r > n)
			System.out.printf("%.2f",(float)((n*2)-r));
		
		else
			System.out.printf("%.2f",(double)(r));
	}
}
