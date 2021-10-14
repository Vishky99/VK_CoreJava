package Session;

class Account{
	private int acc_balance = 0;
	
	public Account(int a) {
		this.acc_balance = a;
	}
	
	void withdraw(int amount) {
		//this.acc_balance = this.acc_balance - w;
		try {
			if(amount > acc_balance) {
				throw new WithdrawException("Insufficient Balance");
			}
			else
				this.acc_balance -= amount;
		}
		catch(WithdrawException e) {
			System.out.println(e);
		}
	}
	
	void showBalance() {
		System.out.println("New Amount: "+acc_balance);
	}
}

class WithdrawException extends Exception{
	String msg;
	
	public WithdrawException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public String toString() {
		return "Withdraw Exception : "+this.msg;
	}	
}

public class Program_5_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account(25000);

		ac.withdraw(30000); 		//handle exception --> Insufficient balance
		ac.withdraw(20000); 		//fine
		ac.showBalance();		//Balance: 5000
		ac.withdraw(10000); 		//handle exception --> Insufficient balance
		ac.showBalance();		//Balance: 5000

	}

}
