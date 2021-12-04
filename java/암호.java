package project4;

import java.util.Scanner;

public class 암호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strpw;
		
		while(sc.hasNext())							// 여러 줄을 입력받기 위한 while문
		{
			strpw = sc.nextLine();					// 한 줄씩 입력받기
			
			if(strpw.equals("exit"))				// 반복 입력에서 탈출하기 위한 키워드
			{
				break;
			}
			coding code = new coding(strpw);		// 암 , 복호화 시켜주는 클래스를 선언
		}
	}
}
class coding										// 암 , 복호화 클래스
{
	coding(String pw)								// 생성자를 이용하여 코드 단축
	{
		String temp = "";							// 임시로 사용할 빈 문자열 변수 선언
		for(int i = 0; i < pw.length(); i++)
		{
			temp += decoding(pw.charAt(i));			// 메인메소드에서 입력받은 문자열을 한 글자씩 나눠 복호화 한 뒤 temp 문자열에 추가해주는 메소드
		}
		System.out.println(temp);
	}
	
	char decoding(char word)
	{
		if(word > 64 && word < 91)					// Ascii 코드를 이용하여, 대문자를 입력받았을 경우와 소문자를 입력받았을 경우에 변환해주는 if문
			word = (char)(155 - word);				// 대문자 A의 아스키코드(60) + 대문자 Z의 아스키코드(90) = 155에서 if문 조건에 일치하는 대문자 알파벳의 아스키 코드값을 빼줌으로써 암 , 복호화 기능 수행
		else if (word > 96 && word < 123)
			word = (char)(219 - word);				// 소문자 a의 아스키코드(97) + 소문자 z의 아스키코드(122) = 219에서 if문 조건에 일치하는 소문자 알파벳의 아스키 코드값을 빼줌으로써 암, 복호화 기능 수행
		return word;
	}
}