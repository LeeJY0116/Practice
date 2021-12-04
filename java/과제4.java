package project3;

import java.util.Scanner;

public class °úÁ¦4{
	public static void main(String[] args) {

		Battle clBattle = new Battle();
		Scanner sc = new Scanner(System.in);
		
		int nfir_hp = sc.nextInt();
		while (nfir_hp < 0 ) {
            nfir_hp = sc.nextInt();
        }
		int nfir_power = sc.nextInt();
		while (nfir_power < 0 ) {
            nfir_power = sc.nextInt();
        }
		int nfir_def = sc.nextInt();
		while (nfir_def < 0 ) {
            nfir_def = sc.nextInt();
        }
		int nsec_hp = sc.nextInt();
		while (nsec_hp < 0 ) {
            nsec_hp = sc.nextInt();
        }
		int nsec_power = sc.nextInt();
		while (nsec_power < 0 ) {
            nsec_power = sc.nextInt();
        }
		int nsec_def = sc.nextInt();
		while (nsec_def < 0 ) {
			nsec_def = sc.nextInt();
        }
		Yaongi clFirst_Ya = new Yaongi(nfir_hp, nfir_power, nfir_def);
		Yaongi clSecond_Ya = new Yaongi(nsec_hp, nsec_power, nsec_def);
		clBattle.Status_1(clFirst_Ya);
		clBattle.Status_2(clSecond_Ya);
		clBattle.setcount(0);
		clBattle.game();
	}
}
class Yaongi 
{
	int MAXHP = 0;
	int HP = 0;
	int DEF = 0;
	int ATK = 0;
	int FIRST = 1;
	int SECOND = 2;
	
	Yaongi(){
	}
	Yaongi(int strength, int power, int defense){
		MAXHP = strength;
		DEF = defense;
		HP = MAXHP;
		ATK = power;	
	}	
}
class Battle{
	Yaongi fir_Ya = new Yaongi();
	Yaongi sec_Ya = new Yaongi();
	private int count;
	public void setcount(int x)
	{
		this.count = x;
	}
	public int getcount()
	{
		return count;
	}
	

	public void Status_1(Yaongi n1){
		fir_Ya = n1;
	}
	public void Status_2(Yaongi n2){
		sec_Ya = n2;
	}
	public void game() {
		System.out.println(count + " " + fir_Ya.HP + " " + sec_Ya.HP);
		count++;
		while((fir_Ya.HP > 0) && (sec_Ya.HP > 0)){
			if((fir_Ya.ATK - sec_Ya.DEF) > 0 )
			{
				sec_Ya.HP -= (fir_Ya.ATK - sec_Ya.DEF);
			}
			else
			{
				sec_Ya.HP = sec_Ya.HP;
			}
			System.out.println(count + " " + Math.max(0, fir_Ya.HP)
			+ " " + (Math.max(0, sec_Ya.HP)));
			sec_Ya.ATK += (int)(sec_Ya.ATK * 0.1);
			count++;
			if (sec_Ya.HP <= 0)
			{
				break;
			}
			if((sec_Ya.ATK - fir_Ya.DEF) > 0 )
			{
				fir_Ya.HP -= (sec_Ya.ATK - fir_Ya.DEF);
			}
			else
			{
				fir_Ya.HP = fir_Ya.HP;
			}
			System.out.println(count + " " + Math.max(0, fir_Ya.HP)
			+ " " + (Math.max(0, sec_Ya.HP)));
			fir_Ya.ATK += (int)(fir_Ya.ATK * 0.1);
			count++;
		}
		if (fir_Ya.HP > sec_Ya.HP){
			System.out.println(fir_Ya.FIRST);
		}
		else{
			System.out.println(sec_Ya.SECOND);

		}
    }
}