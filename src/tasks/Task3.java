package tasks;
/*
 * 3) Write a program with method name sum() that accepts two parameters
 * from user and print the sum of two numbers. Output format should be as:
 * First number is:
 * Second number is:
 * Sum is: 
 */
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Statically calling method sum.
		sum();

	}
	
	/*
	 * Method sum() has no argument because it gets input from user.
	 * It also has no output because it prints sum to screen.
	 */
	private static void sum(){
		Scanner user = new Scanner (System.in);
		
		int a;
		int b;
		
		//Ask user for inputs
		System.out.println("Enter your first integer.");
		a=user.nextInt();
		System.out.println("Enter your second integer.");
		b=user.nextInt();
		
		//Print out results according prescribed format.
		System.out.println("First number is: "+a
				+"\nSecond number is: "+b
				+"\nSum is: "+(a+b));
		
		user.close();
	}

}
