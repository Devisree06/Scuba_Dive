package SimpleProgram;

public class stateBank implements scubaInterface{
	int desposit;
	int withdraw;
	public void deposit(int amount)
	{
		System.out.println("Amount deposited: " +amount);
		desposit=amount;
	}
	public static void main(String args[])
	
	{
		stateBank s1= new stateBank();
		s1.deposit(1000);
		s1.withdraw(10);
		System.out.println("Balance" + s1.calBal());
	}
	public void withdraw(int amount1) {
		System.out.println("Amount withdrawed: " +amount1);
		withdraw=amount1;
	}
	public int calBal() {
		// TODO Auto-generated method stub
		return desposit-withdraw;
	}

}
