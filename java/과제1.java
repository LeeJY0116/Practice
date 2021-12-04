package project1;

import java.util.Scanner;

public class °úÁ¦1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		int x = sc.nextInt();
		int n = sc.nextInt();
		int t = sc.nextInt();
		int r = (x*t)%(n*2);
		
		if
		(r > n)
			System.out.printf("%d",(n*2)-r);
		
		else
			System.out.println(r);
		
	

	}

}
