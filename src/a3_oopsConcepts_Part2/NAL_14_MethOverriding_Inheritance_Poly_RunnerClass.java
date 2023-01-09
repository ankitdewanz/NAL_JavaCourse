/*
 * Course : Core Java Tutorials For Beginners - By Naveen AutomationLabs
 * Video: Method Overriding, Inheritance and Polymorphism in Java - Core Java - Part -13
 * Video Link : https://www.youtube.com/watch?v=DWpYniQAVyI&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=14
 * 
 */
package a3_oopsConcepts_Part2;

/**
 * @author Ankit_Dewan
 *
 */
public class NAL_14_MethOverriding_Inheritance_Poly_RunnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1. Static Polymorphism or compile time polymorphism
		NAL_14_MethOverriding_Inheritance_Poly_BMW bmw= new NAL_14_MethOverriding_Inheritance_Poly_BMW();
		bmw.start(); //1.1 defined in both Parent [Car()] and Child [BMW()] class. As object of child class is created, so BMW()'s start will be called 
		bmw.stop();
		bmw.refule();
		bmw.theftSafety();
		
		System.out.println("***********");
		NAL_14_MethOverriding_Inheritance_Poly_Car car = new NAL_14_MethOverriding_Inheritance_Poly_Car();
		car.start();
		car.stop();
		car.refule();
		car.engine();
		
		System.out.println("***********");
		
		//Top Casting
		NAL_14_MethOverriding_Inheritance_Poly_Car car1 = new NAL_14_MethOverriding_Inheritance_Poly_BMW();
		car1.start(); //Dynamic Polymorphism or run time polymorphism
		car1.stop();
		car1.engine();
		car1.refule();
		
		//Down Casting - It is not allowed in Java
		//NAL_14_MethOverriding_Inheritance_Poly_BMW car2 = (NAL_14_MethOverriding_Inheritance_Poly_BMW) new NAL_14_MethOverriding_Inheritance_Poly_Car();
		//Above line gives no compile time error. But throws runtime exception -> No java.lang.ClassCastException
		

	}//End of main method 

}//End of class
