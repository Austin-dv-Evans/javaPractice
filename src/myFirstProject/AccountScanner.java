package myFirstProject;
import java.util.Scanner;

public class AccountScanner {
	public static void main(String[] args) {
	    double balance = 0, minbal = 500, depositAmt = 0;
	    Scanner sc = new Scanner(System.in);
	    while(depositAmt < minbal) {
	        System.out.println("Enter the amount to be deposit");
	        depositAmt = sc.nextInt();
	      }
	      balance = depositAmt;
	      System.out.println("Your deposit was successful");
	    }
}

