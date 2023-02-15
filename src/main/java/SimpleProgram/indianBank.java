package SimpleProgram;

public class indianBank implements scubaInterface{
	
	int deposit;
	int withdraw;

	public void deposit(int amount) {
		System.out.println("Amount deposited: " +amount);
		deposit=amount;
	}

	public void withdraw(int amount) {
		System.out.println("Amount withdrawed: " +amount);
		withdraw=amount;
	}

	public int calBal() {
		// TODO Auto-generated method stub
		
		return deposit-withdraw;
	}

	public static void main(String args[])
	{
		indianBank obj1Bank=new indianBank();
		obj1Bank.deposit(3000);
		obj1Bank.withdraw(2000);
		System.out.println("Balance:" + obj1Bank.calBal());	}
}
