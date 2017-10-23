import java.util.InputMismatchException;
import java.util.Scanner;

public interface Accountable {
	void withdraw();
	void deposit();
	double getBalance();
	
	public static void Choice(BankAccount cos,int choice){
		//int choice=0;
		Scanner in = new Scanner(System.in);
		boolean check = true;
		
			switch(choice){
				case 1:
					double amount = 0;
					System.out.println("Please enter the amount you would like to withdraw:");
					do{
						try{
							amount = in.nextDouble();
							if(amount <0){
								System.out.println("Error! Please enter a correct amount");
								in.nextLine();
							}
							else{
								check = false;
							}
						}
						catch(InputMismatchException e){
							System.out.println("Error! Please choose one of the options");
							 in.nextLine();
						}
					}while(check);
					cos.withdraw(amount);
					//check=true;
					break;
				case 2:
					double amount2 = 0;
					System.out.println("Please enter the amount you would like to Deposit:");
					do{
						try{
							amount2 = in.nextDouble();
							if(amount2 <0){
								System.out.println("Error! Please enter a correct amount");
								in.nextLine();
							}
							else{
								check = false;
							}
						}
						catch(InputMismatchException e){
							System.out.println("Error! Please choose one of the options");
							 in.nextLine();
						}
					}while(check);
					cos.deposit(amount2);
					break;
				case 3:
					//System.out.println("Balance: "+cos.getBalance());
					System.out.printf("Balance: "+"$%,.2f",cos.getBalance());System.out.println("");
					break;
			}
	}
}
