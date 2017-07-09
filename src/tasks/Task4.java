package tasks;

/*
 * 4)
 * Write a program to accepts two integers from stdin and find
 * all the odd as well as even integers present in between them.
 */

import java.util.Scanner;

public class Task4 {

	public static void main (String[] args){
		
		Scanner user = new Scanner (System.in);
		
		System.out.println("I will tell you all the odd integers and "
				+ "\nall the even integers between 2 integers."
				+ "\nEnter your first integer.");
		int low = user.nextInt();
		
		System.out.println("Enter your second integer.");
		int hi = user.nextInt();
		user.close();
		
		//Enforce low is less than hi first 
		if(hi<low){
			int a = low;
			low = hi;
			hi = a;
		}
		
		//Print out odd integers.
		System.out.println("Odd integers:");
		//loop between lowest and highest integers.
		for(int i=low; i<hi; i++){
			//Print integer if it's odd.
			if(i%2 == 1)
				System.out.print(" "+i);
		}

		//Print out even integers.
		System.out.println("\nEven integers:");
		//loop between lowest and highest integers.
		for(int i=low; i<hi; i++){
			//Print integer if it's even.
			if(i%2 == 0)
				System.out.print(" "+i);
		}
	}
}
