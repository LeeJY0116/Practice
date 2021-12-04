package project4;

import java.util.ArrayList;
import java.util.Scanner;

public class testproject4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Coin clcoin = new Coin();
		People[] clpeo = new People[5];
		for(int i = 0 ; i < 5; i++)
			clpeo[i] = new People();
		clcoin.nValue = sc.nextInt();
		for(int i = 0; i < clpeo.length; i++)
		{
			clpeo[i].nMoney = (sc.nextInt());
		}
		for(int j = 0; j < 3; j++)
		{
			ArrayList<Integer> re = new ArrayList<>();
			for(int i = 0; i < clpeo.length; i++)
			{
				int a = 0;
				int buycoin = 0;
				int coinlist = 0;
				int sellcoin = 0;
				a = sc.nextInt();
				if(re.contains(a) || a - 1 > clpeo.length)
				{
					a = sc.nextInt();
				}
				re.add(a);
				coinlist = sc.nextInt();
				if(coinlist == 1)
				{
					buycoin = sc.nextInt();
					if(clpeo[a].nMoney >= buycoin * clcoin.nValue && (clcoin.nValue >= 0))
					{
						clpeo[a].nhasCoin += buycoin;
						clpeo[a].nMoney -= buycoin * clcoin.nValue;
						clcoin.Up(buycoin);
					}
					else
						continue;

					
					
				}
				else if(coinlist == 2)
				{
					sellcoin = sc.nextInt();
					if(clpeo[a].nhasCoin >= sellcoin && (clcoin.nValue - (1 * sellcoin)) >= 0)
					{
						clpeo[a].nhasCoin -= sellcoin;
						clpeo[a].nMoney += clcoin.nValue * sellcoin;
						clcoin.Down(sellcoin);
					}
					else
					{
						continue;
					}

				}
				else
				{
					i--;
					continue;
				}
			}
		}
		System.out.println(clpeo[4].nhasCoin + " " + clcoin.nValue);
	}

}

class Coin
{
	int nValue = 0;
	
	void Up(int count)
	{
		nValue += (1 * count);
	}
	void Down(int count)
	{
		nValue -= (1 * count);
	}
}

class People
{
	int nMoney = 0;
	int nhasCoin = 10;
}
