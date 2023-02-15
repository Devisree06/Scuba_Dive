package SimpleProgram;

public class staticUsage {

	static int a=15;
	static int b;
	static void messPrint()
	{
		System.out.println("Inside static block");
	}
	static
	{
		System.out.println("Static block initialzed");
		b=a + 10;

	}
	public static void main(String args[])
	{
		messPrint();
		System.out.println("value of a : " + a);
		System.out.println("value of b : " + b);
		a=a+1;
		b=b+1;
		System.out.println("value of a : " + a);
		System.out.println("value of b : " + b);
		
	}
}
