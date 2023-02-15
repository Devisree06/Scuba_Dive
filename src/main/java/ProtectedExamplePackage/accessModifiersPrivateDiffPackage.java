package ProtectedExamplePackage;

import SimpleProgram.accessModifiersProtectedSamePackage;

public class accessModifiersPrivateDiffPackage extends accessModifiersProtectedSamePackage {
	
	public static void main (String args[])
	{
		accessModifiersPrivateDiffPackage obj=new accessModifiersPrivateDiffPackage();
		obj.protectedMethod();
		System.out.println("Calling variable from another package: " + obj.a);
		
	}

}
