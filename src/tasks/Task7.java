package tasks;
/*
 * 7)
 * Can you overload a method with same return type.? Explain your answer with proper logic.
 */
public class Task7 {

	public static void main (String[] args){
		
		//Statically calling both method: sum(int a, int b)
		System.out.println("First method:"
				+ "\nsum("+7+", "+2+") = "+sum(7,2));
		
		//Statically calling overloaded method: sum(int a, int b, int c)
		System.out.println("\nOverload method:"
				+ "\nsum("+3+", "+2+", "+9+") = "+sum(3,2,9));
	}
	
	/*
	 * This method takes 2 parameters and returns their sum.
	 */
	static int sum(int a, int b){
		return a+b;
	}
	
	/*
	 * This method overloads the first by taking more parameters (3) and
	 * it also returns their sum which is an integer.
	 * 
	 * Overloading a method isn't based on the return type, It's based on
	 * the name of the methods being the same, but having different number
	 * of parameters. 
	 */
	static int sum(int a, int b, int c){
		return a+b+c;	
	}

}
