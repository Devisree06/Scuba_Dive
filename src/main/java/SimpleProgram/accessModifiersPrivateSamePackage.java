package SimpleProgram;


public class accessModifiersPrivateSamePackage  
{
	private int a = 40;
	private void privateMethod()
	{
	System.out.println("Inside private method");	
	}

	public static void main(String args[])
	{
		accessModifiersPrivateSamePackage obj=new accessModifiersPrivateSamePackage();
		obj.privateMethod();
		System.out.println("Private variable" + obj.a);
	}
}
