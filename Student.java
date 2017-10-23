
public class Student implements Person{
	private String name;
	private BankAccount check;
	private BankAccount saving;
	
	public Student(){
		name = "Jose";
		check = new Checking();
		saving = new Savings();
	}
	
	public Student(String n, double c){
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

	public BankAccount getSaving() {
		return saving;
	}
	public BankAccount getChecking(){
		return check;
	}

	public void setSaving(BankAccount saving) {
		this.saving = saving;
	}
	
	

}
