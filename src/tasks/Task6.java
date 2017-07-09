package tasks;
/*
 * 6)
 * Write a program consisting method sum() and demonstrate the concept
 * of method overloading using this method.
 */
public class Task6 {
	
	public static void main (String[] args){
		
		//Statically calling both method: sum(int a, int b)
		System.out.println("First method:  sum(int a, int b)");
		sum(4,6);
		//Statically calling overloaded method: sum(int a, int b, int c)
		System.out.println("\nOverload method:  sum(int a, int b, int c)");
		sum(3,5,7);
	}
	
	/*
	 * This method takes 2 parameters and displays their sum.
	 */
	static void sum(int a, int b){
		System.out.println(a+" + "+b+" = "+(a+b));
	}
	
	/*
	 * This method overloads the first by taking more parameters (3) and
	 * also displays their sum. 
	 */
	static void sum(int a, int b, int c){
		System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));		
	}

}
