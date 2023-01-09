/**
 * Course : Core Java Tutorials For Beginners - By Naveen AutomationLabs
 * Video  : What is Call By Value & Call By Reference In Java - Core Java - Part -12
 * Video Link : https://www.youtube.com/watch?v=mpFk7Vh8lHY&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=13
 */
package a2_oopsConcepts_Part1;

/** Call by Value -> variables like int , boolean etc. are passed like this
 * Call by Reference -> Object reference are passed like this
 * @author Ankit_Dewan
 *
 */
public class NAL_13_CallByValAndCallByRef {
	//Global non-static variables
	int p;
	int q;
	
	public static void main(String[] args) {
		NAL_13_CallByValAndCallByRef obj = new NAL_13_CallByValAndCallByRef();
		obj.p = 10;
		obj.q = 20;
		int i = obj.totalSum(obj.p, obj.q); //Call by value or pass by value
		System.out.println(i);
		System.out.println(obj.p+obj.q);
		System.out.println(obj.totalSum(obj));
		System.out.println(obj.p+obj.q);
		obj.swap(obj);
		System.out.println(obj.p+" "+obj.q);
	} //End of main
	public int totalSum(int a, int b) { //Call by Value
		a=0;
		b=0;
		return a+b;
	}//end of totalSum() method
	public int totalSum(NAL_13_CallByValAndCallByRef t) { // Call by Reference
		t.p=25;
		t.q=35;
		return (t.q+t.p);
	} //end of totalSum
	public void swap(NAL_13_CallByValAndCallByRef t) {
		int temp = t.q;
		t.q = t.p;
		t.p = temp;
		
		
	} //end of swap

} //end of class