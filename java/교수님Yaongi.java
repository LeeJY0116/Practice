package project4;

import java.util.Scanner;

class Yaongi {
	private int hp;
	private int attack;
	private int defence;
	
	Yaongi(int hp, int attack, int defence)
	{
		this.hp = hp;
		this.attack = attack;
		this.defence = defence;
	}
	
	int getHP()
	{
		return hp;
	}
	
	int getAttack()
	{
		return attack;
	}
	
	boolean isAlive()
	{
		if(hp <= 0)
			return false;
		else
			return true;
	}
	
	void attack(Yaongi catDefender)
	{
		
	}
	
	void defence(Yaongi catAttacker)
	{
		hp -= catAttacker.getAttack() - defence;
		skillBerserker();
		
		if(hp < 0)
			hp = 0;
	}
	
	void skillBerserker()
	{
		attack += (int)(attack * 0.1);
	}
}

class YaongiFight
{
	Yaongi cat1, cat2 ;
	YaongiFight(Yaongi cat1, Yaongi cat2)
	{
		this.cat1 = cat1;
		this.cat2 = cat2;
	}
	
	void Fight()
	{
		int roundNum = 0;
		
		System.out.println(roundNum + " " + cat1.getHP() + " " + cat2.getHP()); // 초기값 출력
		
		while(cat1.isAlive() && cat2.isAlive())
		{
			roundNum++;
			
			if(roundNum % 2 == 1) // 홀수 라운드
			{
				cat1.attack(cat2);
				cat2.defence(cat1);
			}
			else		   // 짝수 라운드
			{
				cat2.attack(cat1);
				cat1.defence(cat2);
				
			}
			System.out.println(roundNum + " " + cat1.getHP() + " " + cat2.getHP()); // 라운드 결과값 출력

		}
	}
}
public class 교수님Yaongi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Yaongi cat1 = new Yaongi(sc.nextInt(), sc.nextInt(), sc.nextInt());
		Yaongi cat2 = new Yaongi(sc.nextInt(), sc.nextInt(), sc.nextInt());
		sc.close();
		
		YaongiFight yf = new YaongiFight(cat1, cat2);
		yf.Fight();
	}

}
