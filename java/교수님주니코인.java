package project4;

import java.util.Scanner;

class Coin
{
	private int value;			// ���� ��ġ
	Person[] persons = new Person[5];
	
	Coin(int value)				// ������
	{
		this.value = value;
	}
	
	int getValue()
	{
		return value;
	}
	
	void setValue(int change)
	{
		value += change;
	}
	
	// �Ǹ����� �� ���� ��ġ�� ������ �Ǵ��� üũ
	boolean isSellable(int num)
	{
		if(value < num)
			return false;
		
		return true;
	}
	
	void trade(int numPerson, int buyOrSell, int num)	// �ŷ�
	{
		if(buyOrSell == 1)	// ���Ž�
		{
			if(persons[numPerson].buy(value, num))		// ���� ������
				setValue(num);							// ���� ��ġ num��ŭ ���
		}
		else			// �ǸŽ�
		{
			if(isSellable(num) && persons[numPerson].sell(value, num) )		// �Ǹ� ������
				// AND �������� ��ġ�� �߿���. �� �� ������ && �������� �յڰ� �ٲ�� �ǸŴ� ������, ��ġ�� �������� �ʴ� ��Ȳ�� �߻���.
				setValue(-num);										// ���� ��ġ num��ŭ �϶�
		}
	}
}

class Person
{
	private int money;
	private int numOfCoin;
	
	Person(int moeny)
	{
		this.money = money;
		numOfCoin = 10;
	}
	
	int getNumofCoin()
	{
		return numOfCoin;
	}
	
	boolean buy(int value, int num)
	{
		if(money < value * num)		// �ں����� ������ ���, ���� ����
			return false;
		
		money -= value * num;		// �ں��� ����
		numOfCoin += num;			// ���ΰ��� ����
		return true;
	}
	
	boolean sell(int value , int num)// ���� �� ������ ���, �Ǹ� ����
	{
		if(numOfCoin < num)
			return false;
		
		money += value * num;		// �ں��� ����
		numOfCoin -= num;			// ���ΰ��� ����
		return true;
	}
}


public class �������ִ����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Coin coin = new Coin(sc.nextInt()); // ù ��° �� , ���� ��ġ
		
		for(int i = 0; i < 5; i++)			// �� ��° �� , �ں���
			coin.persons[i] = new Person(sc.nextInt());
		for(int i = 0; i < 3; i++)			// 3��
			for(int j = 0; j < 5; j++)		// 5��
				coin.trade(sc.nextInt(), sc.nextInt() , sc.nextInt());	// �ŷ�

		// ��� ���
		System.out.println(coin.persons[4].getNumofCoin() + " " + coin.getValue());
		sc.close();
		

	}

}
