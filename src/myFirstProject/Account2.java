package myFirstProject;

public class Account2 {
	public static void main(String[] args) {
		double balance = 1600;
		System.out.println("Amount to withdraw: ");
		double amount = 1500;
		if(amount < 0 || amount > balance) {
			System.out.println("Withdraw has failed");
		}
		else {
			balance -= amount;
			System.out.println("Withdraw has succeeded");
		}
	}
}
