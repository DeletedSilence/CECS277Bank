
public class BankAccount {
	private double balance;
	private double minimumBalance;
	private double initialBalance;
	private int transanctionFee;
	private double Totalfees;
	
	public BankAccount(){
		balance = 0;
		initialBalance = balance;
		minimumBalance = balance;
		transanctionFee=0;
		Totalfees = 0;
	}
	
	public BankAccount(double start){
		balance = start;
		initialBalance = balance;
		minimumBalance = balance;
		transanctionFee=0;
		Totalfees = 0;
	}
	
	public void deposit (double amount){
		System.out.print("Amount Deposited: ");
		System.out.printf("$%,.2f",amount);System.out.println("");
		balance += amount;
		if(minimumBalance > balance){
			minimumBalance = balance;
		}
		transanctionFee++;
		if(transanctionFee>5){
			endOfMonth();
		}
	}
	
	public void withdraw(double amount){
		System.out.print("Amount Withdrew: ");
		System.out.printf("$%,.2f",amount);System.out.println("");
		if(amount>balance){
			System.out.println("Overdraft fee charged: $10.00");
			balance -= 10;
			balance -= amount;
			Totalfees +=10;
		}
		else{
			balance -=amount;
		}
		if(minimumBalance > balance){
			minimumBalance = balance;
		}
		transanctionFee++;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getInitialBalance(){
		return initialBalance;
	}
	
	public double getMinimumBalance(){
		return minimumBalance;
	}
	public int getTransanction(){
		return transanctionFee;
	}
	public void setTransanction(int fee){
		transanctionFee = fee;
	}
	public void setBalance(double amount){
		balance = amount;
	}
	
	public void endOfMonth(){
		if(transanctionFee>5){
			transanctionFee -=5;
			balance -= transanctionFee;
			Totalfees = Totalfees+transanctionFee-5;
		}
		double interest = minimumBalance/100;
		balance += interest;
	}
	
	public String toString(){
		return "Balance: " + balance+"\n"+"InitialBalance: "+initialBalance+"\n"+"Total Fees Charged: "+Totalfees+"\n";
	}
	

}
