package SimpleProgram;

  class accessProtectedMethodsVar 
{
	protected int a=30;
	
	protected void protectedMethod()
	{
		System.out.println("Inside Protected Method");
	}

}

public class accessModifiersProtectedSamePackage extends accessProtectedMethodsVar {
	public static void main (String args[]) {
	
	accessModifiersProtectedSamePackage obj=new accessModifiersProtectedSamePackage();
	System.out.println("Inside Protected variable : " + obj.a);
	obj.protectedMethod();
	}

}
