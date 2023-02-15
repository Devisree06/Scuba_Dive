package SimpleProgram;

 class accessModifiersEx {

	   public int publicVar = 40;

	   public void publicMethod() 
	   {
	      System.out.println("Inside public method");
	   }
	}

	 class accessModifiersPublic extends accessModifiersEx {

	   public static void main(String[] args)
	   {
		   accessModifiersPublic obj = new accessModifiersPublic();

	      System.out.println("Public variable value: " + obj.publicVar);

	      obj.publicMethod();
	   }
	}
