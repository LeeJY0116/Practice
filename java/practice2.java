package practice1;

public class practice2 {

	public static void main(String[] args) {
		char chga1 = '��';
		char chga2 = '\uac00';
		
		boolean bcham = true;
		boolean bgeojit = false;
		
		System.out.println(chga1);
		System.out.println((int)chga1);
		System.out.println(++chga2);
		System.out.println(--chga2);
		System.out.println(bcham + "�� �ƴϸ� " + bgeojit + "�Դϴ�.");
	}

}
