package project3;
import java.util.ArrayList;
import java.util.Scanner;
public class 중간고사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coin clcoin = new Coin(sc.nextInt());
		People[] mans = new People[5];
		for(int i = 0; i < 5; i++)
		{
			mans[i] = new People(sc.nextInt());
		}
		Trade tr = new Trade(mans, clcoin, sc);
		tr.sellbuy();
	}
}
class Trade
{
	Coin coins;
	Scanner sc;
	Trade(People[] mans, Coin coins, Scanner sc)
	{
		this.mans = mans;
		this.coins = coins;
		this.sc = sc;
	}
	People[] mans;
	void sellbuy()
	{
		for(int j = 0; j < 3; j++)
		{
			int temp = 0;
			int coinlist = 0;
			int value = 0;
			int nmoney = 0;
			int nhascoin = 0;
			ArrayList<Integer> re = new ArrayList<>();
			for(int i = 0; i < mans.length; i++)
			{
				temp = sc.nextInt();
				if(re.contains(temp) || temp - 1 > mans.length)
				{
					temp = sc.nextInt();
					System.out.println("다시");
				}
				re.add(temp);
				coinlist = sc.nextInt();
				if(coinlist == 1)
				{
					value = sc.nextInt();
					if(mans[temp].getmoney() >= value * coins.getvalue() && (coins.getvalue() >= 0))
					{
						nhascoin = mans[temp].getcoin() + value; 
						mans[temp].setcoin(nhascoin);
						nmoney = mans[temp].getmoney() - value * coins.getvalue();
						mans[temp].setmoney(nmoney);
						coins.Up(value);
					}
					else
						continue;
				}
				else if(coinlist == 2)
				{
					value = sc.nextInt();
					if(mans[temp].getcoin() >= value && (coins.getvalue() - (1 * value)) >= 0)
					{
						nhascoin = mans[temp].getcoin() - value;
						mans[temp].setcoin(nhascoin);
						nmoney = mans[temp].getmoney() + coins.getvalue() * value;
						mans[temp].setmoney(nmoney);
						coins.Down(value);
					}
					else
						continue;
				}
				else
					continue;
			}
		}
		System.out.println(mans[4].getcoin() + " " + coins.getvalue());
	}
}
class Coin
{
	private int nValue = 0;
	int getvalue()
	{
		return nValue;
	}
	
	Coin(int value)
	{
		this.nValue = value;
	}
	
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
	private int nmoney = 0;
	private int nhascoin = 10;
	int getmoney()
	{
		return nmoney;
	}
	public void setmoney(int a)
	{
		this.nmoney = a;
	}
	int getcoin()
	{
		return nhascoin;
	}
	public void setcoin(int a)
	{
		this.nhascoin = a;
	}
	People(int money)
	{
		this.nmoney = money;
	}
}