package ljy;

import java.util.Scanner;

public class 기말시험2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coin coin = new Coin();
		int [] ncoin = new int[4];
		for(int i = 0; i < ncoin.length; i++)
		{
			ncoin[i] = sc.nextInt();
		}
		CR7 CR7 = new CR7(sc.nextInt(), ncoin);
		CR7.trade();
		

	}
}
class Coin
{	
	private int fhundredcoin = 500;
	private int hundredcoin = 100;
	private int fiftycoin = 50;
	private int tencoin = 10;
	
	int getfhundred()
	{
		return fhundredcoin;
	}
	int gethundred()
	{
		return hundredcoin;
	}
	int getfifty()
	{
		return fiftycoin;
	}
	int getten()
	{
		return tencoin;
	}
}
class CR7
{
	Coin coin = new Coin();
	
	int fhundredcoins= 0;
	int hundredcoins = 0;
	int fiftycoins = 0;
	int tencoins = 0;
	int allvalue = 0;
	int nchangedue = 0;
	int [] ncoin = new int[4];
	int a = 0;
	


	CR7(int due, int[] ncoin)
	{
		this.nchangedue = due;
		this.ncoin = ncoin;
	}
	
	void trade()
	{
		allvalue += ncoin[0] * coin.getfhundred();
		allvalue += ncoin[1] * coin.gethundred();
		allvalue += ncoin[2] * coin.getfifty();
		allvalue += ncoin[3] * coin.getten();
		
		loop:
		for(int j = 0; j < 1; j++)
		{
			if(nchangedue > allvalue)
			{
				System.out.println("Not Enough Coins");
				break;
			}
			else if(nchangedue % coin.getten() != 0)
			{
				System.out.println("Not Enough Coins");
				break;
			}
			for(int i = 0; i < ncoin[0]; i++)
			{
				if(nchangedue >= coin.getfhundred())
				{
					nchangedue -=  coin.getfhundred();
					fhundredcoins += 1;
				}
				else if(ncoin[1] == 0 && ncoin[2] == 0 && ncoin[3] == 0)
				{
					System.out.println("Not Enough Coins");
					break loop;
				}
				else
					break;
			}
			for(int i = 0; i < ncoin[1]; i++)
			{
				if(nchangedue >= coin.gethundred())
				{
					nchangedue -= coin.gethundred();
					hundredcoins += 1;
				}
				else if(ncoin[2] == 0 && ncoin[3] == 0)
				{
					System.out.println("Not Enough Coins");
					break loop;
				}
				else
					break;
			}
			for(int i = 0; i < ncoin[2]; i++)
			{
				if(nchangedue >= coin.getfifty())
				{
					nchangedue -= coin.getfifty();
					fiftycoins += 1;
				}
				else if(ncoin[3] == 0)
				{
					System.out.println("Not Enough Coins");
					break loop;
				}
				else
					break;
			}
			for(int i = 0; i < ncoin[3]; i++)
			{
				if(nchangedue > ncoin[3] * coin.getten())
				{
					System.out.println("Not Enough Coins");
					break loop;
				}
				else if(nchangedue >= coin.getten())
				{
					nchangedue -= coin.getten();
					tencoins += 1;
				}
				else
					break;
			}
			System.out.println(fhundredcoins + " " + hundredcoins + " " + fiftycoins + " " + tencoins); 
		}
	}
}