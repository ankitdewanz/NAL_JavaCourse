/**
 * Course: Core Java Tutorials For Beginners - By Naveen AutomationLabs
 * Video : What is Method Overloading In Java - Core Java - Part 9
 * Video Link : https://www.youtube.com/watch?v=wEEXgVoY9W0&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=9
 *   
 */
package a2_oopsConcepts_Part1;

/**1. Method Overloading is allowed but 2. and 3. are not - When the method name is same with different arguments or input parameters within the same class. 
 * 2. You cannot create another method inside a method. -> Nike factory inside Rebook factory is not viable.
 * 3. Duplicate methods are not allowed i.e. two methods with same name and number of arguments or input parameters within a class is not allowed. 
 * @author Ankit_Dewan
 *
 */
public class NAL_9_MethodOverloading {
	public static void main(String[] args) {
		NAL_9_MethodOverloading obj = new NAL_9_MethodOverloading();
		System.out.println(obj.sum());
		System.out.println(obj.sum(20));
		System.out.println(obj.sum(10, 20));
	}
	public int sum() { // no input parameters
		int i = 10;
		int j = 20;
		return i+j;
	}
	public int sum(int a) {//one input parameter
		int i=a;
		return i+10;
		
	}
	public int sum(int a, int b) {//two input parameters
		int i = a;
		int j = b;
		return i + j;
		
	}
}