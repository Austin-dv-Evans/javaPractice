package myFirstProject;

public class Account {
	  private double balance = 5550.00; //state / variable
	  public double  getBalance(int accountId) { // behavior / method
	    // logic here
	    return balance;
	  }
	  public static void main(String[] args) { //main method
		  //when a method returns no value the "return type" is set to void
	    Account accnt = new Account(); // object creation
	    double value = accnt.getBalance(123456); // method invocation
	    System.out.println("The balance is: " + value);
	  }
	} 

// public access modifier has been used for the main method as it is invoked using the Java tool by JVM.  
// Static method has been used for the main method as JVM cannot invoke the main method using the object of the class.
// The method does not return any value, so the return type is void.
// The parameter of the main method is a String array.
// Any number of inputs can be passed to Java program during runtime using command line arguments to java tool (java).
// A String array is used to store these inputs which can be used in our code. Further, look at the points mentioned here.