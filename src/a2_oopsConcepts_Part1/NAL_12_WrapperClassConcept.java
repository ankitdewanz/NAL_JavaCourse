/**
 * Course : Core Java Tutorials For Beginners - By Naveen AutomationLabs
 * Video  : Wrapper Classes In Java - Core Java - Part -11
 * Video Link : https://www.youtube.com/watch?v=8gLTN691BwM&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=12
 */
package a2_oopsConcepts_Part1;

/**
 * @author Ankit_Dewan
 *
 */
public class NAL_12_WrapperClassConcept {

	/**Wrapper classes Integer, Double, Boolean, Character are available to convert the value of a 
	 * different class variable and many more things. 
	 */
	public static void main(String[] args) {
		//1. String to Integer conversion using wrapper class
		String s1 = "100"; 	 // 1.1 parseInt evaluates to integer 100
		String s2 = "23.34"; //2.1 parseDouble evaluates to double 23.34
		String s3 = "true";  //3.1 parseBoolean evaluates to boolean true
		String s4 = "false"; //3.2 parseBoolean evaluates to boolean false
		String s5 = "1";     //3.2 parseBoolean evaluates to boolean false
		String s6 = "0";     //3.2 parseBoolean evaluates to boolean false
		int i2 = 32;		 //4.1 valueOf evaluates to String 32
		double d3 = 323.32;  //4.2 valueOf evaluates to String 323.32
		char c1 = 's';		 //4.3 valueOf evaluates to String s
		boolean b5 = true;   //4.4 valueOf evaluates to String true
		
		System.out.println(s1+20); //Two Strings are concatenated when '+'. Output : 10020
		int i1 = Integer.parseInt(s1); 
		System.out.println(i1+20); //Two integers are added when '+'. Output : 120
		
		//2. String and Integer to Double conversion using wrapper class 
		
		double d1 = Double.parseDouble(s1); 
		double d2 = Double.parseDouble(s2);
		System.out.println(d1+d2+20); //Three double are added. Output : 143.34
		
		//3. String to Boolean conversion using wrapper class
		
		
		boolean b1 = Boolean.parseBoolean(s3);
		boolean b2 = Boolean.parseBoolean(s4);
		boolean b3 = Boolean.parseBoolean(s5);
		boolean b4 = Boolean.parseBoolean(s6);
		
		System.out.println(b1+" "+b2+b3+b4);
		
		//4. String to Character conversion using wrapper class
		
		String s7 = "A";
		
		//5. Integer , Character and double conversion into String using wrapper class
		
		
		String s8 = String.valueOf(i2);
		String s9 = String.valueOf(d3);
		String s10 = String.valueOf(c1);
		String s11 = String.valueOf(b1);
		System.out.println(s8+" "+ s9+" "+s10+" "+s11);
		
		
	} //end of main method

} //end of class