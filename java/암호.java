package project4;

import java.util.Scanner;

public class ��ȣ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strpw;
		
		while(sc.hasNext())							// ���� ���� �Է¹ޱ� ���� while��
		{
			strpw = sc.nextLine();					// �� �پ� �Է¹ޱ�
			
			if(strpw.equals("exit"))				// �ݺ� �Է¿��� Ż���ϱ� ���� Ű����
			{
				break;
			}
			coding code = new coding(strpw);		// �� , ��ȣȭ �����ִ� Ŭ������ ����
		}
	}
}
class coding										// �� , ��ȣȭ Ŭ����
{
	coding(String pw)								// �����ڸ� �̿��Ͽ� �ڵ� ����
	{
		String temp = "";							// �ӽ÷� ����� �� ���ڿ� ���� ����
		for(int i = 0; i < pw.length(); i++)
		{
			temp += decoding(pw.charAt(i));			// ���θ޼ҵ忡�� �Է¹��� ���ڿ��� �� ���ھ� ���� ��ȣȭ �� �� temp ���ڿ��� �߰����ִ� �޼ҵ�
		}
		System.out.println(temp);
	}
	
	char decoding(char word)
	{
		if(word > 64 && word < 91)					// Ascii �ڵ带 �̿��Ͽ�, �빮�ڸ� �Է¹޾��� ���� �ҹ��ڸ� �Է¹޾��� ��쿡 ��ȯ���ִ� if��
			word = (char)(155 - word);				// �빮�� A�� �ƽ�Ű�ڵ�(60) + �빮�� Z�� �ƽ�Ű�ڵ�(90) = 155���� if�� ���ǿ� ��ġ�ϴ� �빮�� ���ĺ��� �ƽ�Ű �ڵ尪�� �������ν� �� , ��ȣȭ ��� ����
		else if (word > 96 && word < 123)
			word = (char)(219 - word);				// �ҹ��� a�� �ƽ�Ű�ڵ�(97) + �ҹ��� z�� �ƽ�Ű�ڵ�(122) = 219���� if�� ���ǿ� ��ġ�ϴ� �ҹ��� ���ĺ��� �ƽ�Ű �ڵ尪�� �������ν� ��, ��ȣȭ ��� ����
		return word;
	}
}