package myFirstProject;

public class EnhancedForLoop {
	public static void main(String[] args) {

		double balance = 6000, rateOfInterest = 0.10, interest = 0;
		double withdrawal = 500, deposit = 600;
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		for(int i: arr) {  

			balance += deposit;   
			balance -= withdrawal;
			interest = balance * rateOfInterest;
			balance += interest;
			System.out.println("The interest for the month " + i + " is " + interest);
		}
		System.out.println("the balance at the end of the year is " + balance);
	}
}
//Best Practices:

//Prefer using a for-each loop for better readability
//
//A normal for loop using index is faster than a for-each loop, 
//as for-each creates an iterator internally to iterate through the elements
//
//You can't use for-each when
//
//You have to modify or delete the collection or array selectively
//
//You need to iterate through more than one collection in parallel