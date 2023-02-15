package SimpleProgram;



public class accessModifiersProtectedDiffClassfile extends accessProtectedMethodsVar {
	
	public static void main (String args[])
	{
		accessModifiersProtectedDiffClassfile obj=new accessModifiersProtectedDiffClassfile();
		obj.protectedMethod();
		System.out.println("Calling variable from another package" + obj.a);
		
	}

}
