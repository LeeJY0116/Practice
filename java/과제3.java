package project1;

import java.util.Scanner;

public class °úÁ¦3
{

	public static void main(String[] args) 
	{
		Yaongi clYaongi = new Yaongi();
		Scanner sc = new Scanner(System.in);
		
		int nfir_strengthinput = sc.nextInt();
		while (nfir_strengthinput < 0 ) {
            nfir_strengthinput = sc.nextInt();
        }
		int nfir_powerinput = sc.nextInt();
		while (nfir_powerinput < 0 ) {
            nfir_powerinput = sc.nextInt();
        }
		int nfir_defenseinput = sc.nextInt();
		while (nfir_defenseinput < 0 ) {
            nfir_defenseinput = sc.nextInt();
        }
		int nsec_strengthinput = sc.nextInt();
		while (nsec_strengthinput < 0 ) {
            nsec_strengthinput = sc.nextInt();
        }
		int nsec_powerinput = sc.nextInt();
		while (nsec_powerinput < 0 ) {
            nsec_powerinput = sc.nextInt();
        }
		int nsec_defenseinput = sc.nextInt();
		while (nsec_defenseinput < 0 ) {
            nsec_defenseinput = sc.nextInt();
        }
		clYaongi.fir_Status(nfir_strengthinput, nfir_powerinput, nfir_defenseinput);
		clYaongi.sec_Status(nsec_strengthinput, nsec_powerinput, nsec_defenseinput);
		clYaongi.game();

	
	}
}

class Yaongi 
{
	int count = 0;
	int fir_maxhealth;
	int fir_health;
	int fir_DEF;
	int fir_ATK;
	int sec_maxhealth;
	int sec_health;
	int sec_DEF;
	int sec_ATK;
	int i;


	void fir_Status(int strength, int power, int defense)
	{
		fir_maxhealth = strength;
		fir_DEF = defense;
		fir_health = fir_maxhealth;
		fir_ATK = power;		
	}
	void sec_Status(int strength, int power, int defense)
	{
		sec_maxhealth = strength;
		sec_DEF = defense;
		sec_health = sec_maxhealth;
		sec_ATK = power;		
	}

	void game()
	{

		System.out.println(count + " " + fir_health + " " + sec_health);
		count++;
		for(i=1; i < fir_health && i < sec_health;)
		{
			sec_health -= (fir_ATK - sec_DEF);
			System.out.println(count + " " + Math.max(0, fir_health) + " " + (Math.max(0, sec_health)));
			if (fir_health <= 0 || sec_health <= 0)
			{
				break;
			}
			sec_ATK += (sec_ATK * 0.1);
			sec_ATK = (int) Math.floor(sec_ATK);
			count++;
			fir_health -= (sec_ATK - fir_DEF);
			System.out.println(count + " " + Math.max(0, fir_health) + " " + (Math.max(0, sec_health)));
			fir_ATK += (fir_ATK * 0.1);
			fir_ATK = (int) Math.floor(fir_ATK);
			count++;
			if (fir_health <= 0 || sec_health <= 0)
			{
				break;
			}
		}
		if (fir_health > sec_health)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("2");
		}
	}
		
}
