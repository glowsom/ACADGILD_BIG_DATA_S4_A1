package tasks;
/*
 * 2)
 * Rewrite the above code, where, inputs are provided by the user at
 * runtime and the output is printed.
 */
import java.util.Scanner;
public class task2 {

	public static void main(String[] args) {
		// TODO Sum of 2 inputs from user
		Scanner user = new Scanner (System.in);
		
		int a;
		int b;
		
		//Ask user for inputs
		System.out.println("Enter your first integer.");
		a=user.nextInt();
		System.out.println("Enter your second integer.");
		b=user.nextInt();
		
		//Print out sum.
		System.out.println(a+" + "+b+" = "+(a+b));
		
		user.close();
	}

}
