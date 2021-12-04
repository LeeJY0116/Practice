package ljy;

import java.util.Scanner;

public class 기말시험 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firmoney = sc.nextInt();
		int nmoney = firmoney;
		int ncount = sc.nextInt();
		String strname;
		int Coke = 500;
		int Cider = 400;
		int Milk = 350;
		int ncokecount = 0;
		int ncidercount = 0;
		int nmilkcount = 0;
		int allvalue = 0;
		String strCoke = "Coke";
		String strCider= "Cider";
		String strMilk = "Milk";
		
		for(int i = 0; i < ncount + 1; i++)
		{
			strname = sc.nextLine();
			if(strname.equals(strMilk))
			{
				if(nmoney < Milk)
				{
					break;
				}
				nmoney -= Milk;
				nmilkcount += 1;
				allvalue += Milk;
			}
			else if(strname.equals(strCider))
			{
				if(nmoney < Cider)
				{
					if(nmoney > Milk)
					{
						nmoney -= Milk;
						nmilkcount += 1;
						allvalue += Milk;
						break;
					}
					else
					{
						allvalue += Cider;
						break;
					}
				}

				nmoney -= Cider;
				ncidercount += 1;
				allvalue += Cider;
			}
			else if(strname.equals(strCoke))
			{
				if(nmoney < Coke)
					if(nmoney > Cider)
					{
						nmoney -= Cider;
						ncidercount += 1;
						allvalue += Cider;
						break;
					}
					else if(nmoney > Milk)
					{
						nmoney -= Milk;
						nmilkcount += 1;
						allvalue += Milk;
						break;
					}
					else
					{
						allvalue += Coke;
						break;
					}

				nmoney -= Coke;
				ncokecount += 1;
				allvalue += Coke;
			}
		}
		System.out.println(ncokecount + " " + ncidercount + " " + nmilkcount);
		System.out.println(nmoney);
		if(firmoney < allvalue)
		{
			System.out.println("Not Enough Money");
		}

	}

}
