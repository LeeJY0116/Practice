package ljy;

public class test5 {
	int a = 10;
	public test5()
	{
		System.out.print("��");
	}
	
	public test5(int x)
	{
		System.out.print("��");
	}

	public static void main(String[] a) {
		B b1 = new B();
		test5 b2 = new B(1);
		System.out.println(b1.a + b2.a);


	}
}

class B extends test5
{
	int a = 20;
	public B()
	{
		System.out.print("��");
	}
	
	public B(int x)
	{
		System.out.print("��");
	}
}