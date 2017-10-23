
public class Instructor implements Person{
	private String name;
	private BankAccount check;
	private BankAccount saving;
	
	public Instructor(){
		name = "Susan";
		check = new Checking();
		saving = new Savings();
	}
	
	public Instructor(String n, double c){
		name = n;
		check = new Checking(c);
		saving = new Savings(c);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCheck(BankAccount check) {
		this.check = check;
	}
	
	public void setSaving(BankAccount saving) {
		this.saving = saving;
	}

	@Override
	public BankAccount getChecking() {
		// TODO Auto-generated method stub
		return check;
	}

	@Override
	public BankAccount getSaving() {
		// TODO Auto-generated method stub
		return saving;
	}

}
