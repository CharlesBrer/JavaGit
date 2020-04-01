
class Account{
	private double balance;
	
	public double getBanlance(){
		return balance;
	}
	
	public void deposit(double money){
		balance += money;
	}
	
	public void withdraw(double money){
		if(balance < money){
			throw new OverDraftException("Í¸Ö§ÁË:",money-balance);
		}
		balance -= money;
	}
}

class OverDraftException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	double deficit;
	public OverDraftException(String message,double deficit){
		super(message+deficit);
	}
	
}

public class BankSer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		System.out.println(a.getBanlance());
		a.deposit(100);
		System.out.println(a.getBanlance());
		a.withdraw(500);
		System.out.println(a.getBanlance());
	}

}
