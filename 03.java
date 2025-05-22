class BankAccount{
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public BankAcccount(int accountNumber,String accountHolder,double balance){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	public int getaccountNumber(){
		return accountNumber;
	}
	
	public String getaccountHolder(){
		return accountHolder;
	}
	
	public double getbalance(){
	    return balance;	
	}
	
	
	public int setaccountNumber(int accountNumber){
		this.accountNumber=accountNumber;
	}
	
	public String setaccountHolder(String accountHolder){
		this. accountHolder= accountHolder;
	}
	
	public double setbalance(double balance){
		this.balance=balance;
	}
	
	public void  withdraw(double amount){
		if(amount>balance)
		{
			throws new illegalArgumentException("Insufficient balance" );
		}
		balance=balance-amount;
	}
public String toString(){
	return "Account: "+accountNumber+", Hlder: "+accountHolder+", Balance "+balance;
} 	
	
}

class Bank{
	private BankAccount[] bankAccount=new BankAccount[5];
	private int accountcount=0;
	

    public void (BankAccount bankaccount) {
        if (accountCount < 5) {
            bankAccount[accountCount++] = bankaccount;
        } else {
            System.out.println("Classroom is full.");
        }
    }
	
	  public void withdrawFromAccount(int accNumber, double amount) {
        for (int i = 0; i < accountcount; i++) {
            if (bankAccount[i].getaccountNumber() == accNumber) {
                try {
                   bankAccount[i].withdraw(amount);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void displayAccounts() {
        for (int i = 0; i < count; i++) {
            System.out.println(accounts[i]);
        }
    }

}
public class BankManager {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount(new BankAccount(1001, "Alice", 5000.0));
        bank.addAccount(new BankAccount(1002, "Bob", 3000.0));

        bank.withdrawFromAccount(1001, 6000.0); 
        bank.withdrawFromAccount(1002, 1000.0); 

        bank.displayAccounts();
    }
}

	