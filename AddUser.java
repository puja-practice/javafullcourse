package add;

import java.util.Scanner;

public class AddUser {

	public static void main(String[] args) {
		System.out.println("Please Enter Your Number");
		int a,b,sum;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();// Read user input
		 System.out.println("Type another number:");
	    b = s.nextInt();// Read user input
	    sum = a+b; // Calculate the sum of x + y
	    System.out.println("Sum is: " + sum); // Print the sum
	    
		

	}

}
