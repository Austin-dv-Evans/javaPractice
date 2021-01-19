package myFirstProject;

public class Bank {
	private String bankName, area;
	private String phoneNumber;
	Bank() { //default constructor
		bankName = "IBank";
		area = "Gandhi Nagar";
		phoneNumber = "3033033033";
	}
	
	Bank(String bankName, String area, String phoneNumber) {
		// parameterized constructor
		this.bankName = bankName;
		this.area = area;
		this.phoneNumber = phoneNumber;
	}
	
	void displayBankDetails() {
		System.out.println("Bank Name: " + bankName);
		System.out.println("Area of Bank: " + area);
		System.out.println("Phone Number of Bank: " + phoneNumber);
	}
	
	public static void main (String[] args) {
		Bank bank1 = new Bank();
		Bank bank2 = new Bank("FirstBank", "Denver", "3033030033");
		
		bank1.displayBankDetails();
		System.out.println("****************");
		bank2.displayBankDetails();
	}
}


//Best Practices:
//
//Data object variables which are mandatory should be initialized through constructor,
//so we can avoid any setters for those variables
//That ensures variables cannot be changed after new instance of object is created