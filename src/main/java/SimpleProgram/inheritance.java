package SimpleProgram;


class grandParent 
{
 int Age=50;
public void GrandParentarea()
{
System.out.println("Chennai");	
}
}

class parent  extends grandParent
{
 int parentAge=20;
public void Parentarea()
{
System.out.println("Pune");	
}
}

class inheritance extends parent {

	public static void main(String[] args) 
	{
		inheritance obj=new inheritance();
		System.out.println("Parent Age : " + obj.parentAge);
		obj.Parentarea();
		
		System.out.println("Grand Parent Age : " + obj.Age);
		obj.GrandParentarea();
	}

}
