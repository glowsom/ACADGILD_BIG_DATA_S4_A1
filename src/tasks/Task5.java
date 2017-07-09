package tasks;
/*
 * 5)
 * Joe is scared to go to school. When her dad asked the reason,
 * joe said she is unable to complete the task given by her teacher.
 * The task was to find the “first 10 multiples” of the number entered from stdin
 * Eg: Input: 3
 * O/p:
 * 3 x 1 = 3
 * 3 x 2 = 6
 * ………
 * ………
 * …….
 * 3 x 10 = 30
 * Help Joe in completing the task!
 */
import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);
		
		//Ask user for input
		System.out.println("You need the first 10 multiples of what integer?");
		int mult = user.nextInt();
		user.close();
		
		//Use a loop to print out first 10 multiples 
		for(int i=1; i<11; i++){
			System.out.println(mult+" x "+i+" = "+(mult*i));
		}
	}

}
