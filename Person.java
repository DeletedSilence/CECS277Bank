import java.util.InputMismatchException;
import java.util.Scanner;

public interface Person {
	BankAccount getChecking();
	BankAccount getSaving();
	
	public static void menu(Person p){
		int choice=0;
		int wdb = 0;
		boolean check = true;
		do{
			System.out.println("Please choose one of the following options");
			System.out.println("(1) Withdraw");
			System.out.println("(2) Deposit");
			System.out.println("(3) Get Balance");
			System.out.println("(4) Exit the Account");
			Scanner in = new Scanner(System.in);
			do{
				try{
					choice = in.nextInt();
					if(choice>4||choice<1){
						System.out.println("Error! Please choose one of the options");
						in.nextLine();
					}
					else{
						check=false;
					}
				}
				 catch(InputMismatchException e){
					 System.out.println("Error! Please choose one of the options");
					 in.nextLine();
				 }
				
			}while(check);
			
			switch(choice){
				case 1:
					wdb=CheckorSave("Withdraw");
					break;
				case 2:
					wdb=CheckorSave("Deposit");
					break;
				case 3:
					wdb=CheckorSave("get the Balance");
					break;
			}
			if(wdb==1&&choice!=4){
				Accountable.Choice(p.getChecking(), choice);
			}
			else if(wdb==2&&choice!=4){
				Accountable.Choice(p.getSaving(), choice);
			}
			
		}while(choice!=4);
		System.out.println("You have exited the Account");
	}
	public static int CheckorSave(String s){
		Scanner in = new Scanner(System.in);
		int pick=0;
		boolean check = true;
		System.out.println("Which account would you like to "+s+" from:");
		System.out.println("(1) Checking");
		System.out.println("(2) Savings");
		do{
		try{
			pick = in.nextInt();
			if(pick<1||pick>2){
				System.out.println("Error! Please choose one of the options");
				in.nextLine();
			}
			else{
				check = false;
			}
		}catch(InputMismatchException e){
			System.out.println("Error! Please choose one of the options");
			 in.nextLine();
		}
		}while(check);
		return pick;
	}
	

}
