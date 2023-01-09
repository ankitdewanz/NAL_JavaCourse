/**
 * 
 */
package a2_oopsConcepts_Part1;

public class NAL_7_FunctionsInJava {

	/**Learn how to create and call NON STATIC functions or methods. 
	 * Static functions to be discussed later in the course.
	 * @param args
	 */
//	main method -> Starting point of executions.
	public static void main(String[] args) {
//		System.out.println("Hello!");
		NAL_7_FunctionsInJava obj = new NAL_7_FunctionsInJava();
//		One object will be created. obj is the reference variable, referring to this object
//		after creating the object, the copy of all non-static methods will be given to this object.
		obj.test();
		int a = obj.sum();
		System.out.println(a);
		float b = obj.division(35, 10);
		System.out.println(b);
		String s = obj.printHello();
		System.out.println(s);
		
	}//end of main method.
	
//	void -> Does not return any value.
//	return type -> void
	public void test() { // no input, no output
		System.out.println("Inside test method");
	}//end of test method.
//Return type int
	public int sum() { // no input , some output
		System.out.println("Inside sum method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
		
	}//end of sum method
	
	public float division(int a, int b) {//takes some input and returns some output
		System.out.println("inside division method");
		float c = 1.0f*a/b;// Since * and / is evaluated from L to R. Multiplication with 1.0f will give correct float result 
		return c;
	}//end of division method
//Return type string
	public String printHello() { // no input but return some output
		System.out.println("inside printHello method");
		String s = "Hello!";
		return s;
	}//end of printHello method

}//end of class 
