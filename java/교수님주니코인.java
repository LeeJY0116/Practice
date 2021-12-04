package project4;

import java.util.Scanner;

class Coin
{
	private int value;			// 코인 가치
	Person[] persons = new Person[5];
	
	Coin(int value)				// 생성자
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
	
	// 판매했을 때 코인 가치가 음수가 되는지 체크
	boolean isSellable(int num)
	{
		if(value < num)
			return false;
		
		return true;
	}
	
	void trade(int numPerson, int buyOrSell, int num)	// 거래
	{
		if(buyOrSell == 1)	// 구매시
		{
			if(persons[numPerson].buy(value, num))		// 구매 성공시
				setValue(num);							// 코인 가치 num만큼 상승
		}
		else			// 판매시
		{
			if(isSellable(num) && persons[numPerson].sell(value, num) )		// 판매 성공시
				// AND 연산자의 위치도 중요함. 이 위 구문의 && 기준으로 앞뒤가 바뀌면 판매는 했지만, 가치는 떨어지지 않는 상황이 발생함.
				setValue(-num);										// 코인 가치 num만큼 하락
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
		if(money < value * num)		// 자본금이 부족한 경우, 구매 실패
			return false;
		
		money -= value * num;		// 자본금 감소
		numOfCoin += num;			// 코인갯수 증가
		return true;
	}
	
	boolean sell(int value , int num)// 코인 수 부족한 경우, 판매 실패
	{
		if(numOfCoin < num)
			return false;
		
		money += value * num;		// 자본금 증가
		numOfCoin -= num;			// 코인갯수 감소
		return true;
	}
}


public class 교수님주니코인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Coin coin = new Coin(sc.nextInt()); // 첫 번째 줄 , 코인 가치
		
		for(int i = 0; i < 5; i++)			// 두 번째 줄 , 자본금
			coin.persons[i] = new Person(sc.nextInt());
		for(int i = 0; i < 3; i++)			// 3일
			for(int j = 0; j < 5; j++)		// 5명
				coin.trade(sc.nextInt(), sc.nextInt() , sc.nextInt());	// 거래

		// 결과 출력
		System.out.println(coin.persons[4].getNumofCoin() + " " + coin.getValue());
		sc.close();
		

	}

}
