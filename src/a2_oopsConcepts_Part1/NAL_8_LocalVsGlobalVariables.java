/**
 * Course: Core Java Tutorials For Beginners - By Naveen AutomationLabs
 * Video number: 8 
 * Video Link : https://www.youtube.com/watch?v=wEEXgVoY9W0&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=8
 *  
 */
package a2_oopsConcepts_Part1;

/**1. Global (non-static) variables are class variables.
 * 2. Local variables are function or method variables.
 * @author Ankit_Dewan
 */

public class NAL_8_LocalVsGlobalVariables {

	//3.  Declare non-static Global variables
	String name = "Krishna";
	int i = 108;
	
	public static void main(String[] args) {
		int i = 10;
		NAL_8_LocalVsGlobalVariables obj = new NAL_8_LocalVsGlobalVariables();
		System.out.println(i); //4. you can access local variables within the function
		System.out.println(obj.i); //5. but to access global non-static class variables an obj needs to be created.  
		System.out.println(obj.name); // 5. but to access global non-static class variables an obj needs to be created.
		System.out.println(obj.sum(10, 20)); //5. but to access global non-static class variables an obj needs to be created.

	} // end of the main method
	public int sum(int a, int b) {
		//Declare local variables for sum function
		int i=a; 
		int j=b;
		int sum = i+j;
//		System.out.println(sum);
		return sum;
	}//end of the sum method
}//end of the class
