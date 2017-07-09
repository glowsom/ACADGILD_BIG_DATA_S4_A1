package tasks;
/*
 * 8)
 * Write a program in java using Arrays,
 * that sorts the element in descending order.
 */
import java.util.Scanner;

public class Task8 {
	
	public static void main (String[] args){
		
		Scanner user = new Scanner(System.in);
		//Ask user for array size.
		System.out.println("What random integer array size do you want"
				+ "\nto sort in descending order?");
		int[] rand = new int[user.nextInt()];
		user.close();
		
		//Populate with random numbers between 0 and 100
		for(int i=0; i<rand.length; i++){
			rand[i] = (int)(Math.random()*100);
		}

		int temp;//Helps in switching integer's index.
		int maxIndex;//Holds index of current max integer
		
		for(int i=0; i<rand.length; i++){
			
			maxIndex=i;//current known max integer before entering loop
			/*
			 * Going through 'j' loop, integer in index 'i' will only
			 * be compared with integers in the indices after it 
			 * (i+1, i+2, ... array.length).
			 * The largest integer within this range will be saved at
			 * index 'i', before next iteration.
			 * This means every index before 'i' will be sorted.
			 */
			for(int j=i+1; j<rand.length; j++){
				/*
				 * For the sake of very big data sets, less switching may
				 * be beneficial. If integer at index j is larger than
				 * current max, only update maxIndex. 
				 */
				if(rand[maxIndex]<rand[j]){
					maxIndex=j;
				}
			}
			/*
			 * If maxIndex isn't 'i', then a the largest number is at index
			 * 'j'. They must switch places so largest integer will take it's
			 * rightful place, and go on to next iteration.
			 */
			if(maxIndex > i){
				temp=rand[i];
				rand[i]=rand[maxIndex];//max Integer takes it's rightful place
				rand[maxIndex]=temp;//integer which was at index i will be compare later. 
			}
		}
		//Using a loop to print out array content
		System.out.println("Your random numbers in descending order.");
		for(int i=0; i<rand.length; i++){
			/*
			 * this print format will display a uniform order by allotting every integer
			 * an even amount of space (a 4-character field)
			 */
			System.out.printf("%4d", rand[i]);
			/*
			 * more formatting: after every 10 elements, a new line is started.
			 */
			if((i+1)%10==0)System.out.println();
		}
	}
}
