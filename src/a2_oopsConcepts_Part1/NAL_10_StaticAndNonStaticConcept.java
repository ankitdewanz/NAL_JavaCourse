/**
 *Course: Core Java Tutorials For Beginners - By Naveen AutomationLabs
 * Video : What is Static and Non-Static in Java - CoreJava Part - 10
 * Video Link : https://www.youtube.com/watch?v=yQkbw66gt9I&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=10
 */
package a2_oopsConcepts_Part1;

public class NAL_10_StaticAndNonStaticConcept {
	String name = "Tom"; //non static global class variable
	static int 	age =25; //static global class variable
	
	public static void main(String[] args) { //start of main method
		//Different ways to call a static method and a static variables

		//1. direct calling - Static variable and methods can be called directly.  
		sum();
		System.out.println(age);
		//2. calling with the class name
		System.out.println(NAL_10_StaticAndNonStaticConcept.age);
		System.out.println(NAL_10_StaticAndNonStaticConcept.age);
		
		//how to call non-static method - first create an object 
		NAL_10_StaticAndNonStaticConcept obj = new NAL_10_StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
//		obj.sum();
	} //end of main method
	public void sendMail() {
		System.out.println("In sendmail method");
	}//end of sendMail function.
	public static void sum() {
		System.out.println("Sum method");
	}//end of static sum method 
}//end of class
