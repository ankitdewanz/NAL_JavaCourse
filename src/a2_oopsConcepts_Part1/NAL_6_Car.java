/**
 * 
 */
package a2_oopsConcepts_Part1;

/**
 * @author Ankit_Dewan
 *
 */
public class NAL_6_Car {

	/** new Car() -> This is the object of the Car class.
	 * new keyword is used to create variables.
	 * a,b,c -> Object reference variables.
	 * @param args
	 */
	//Class variables 
	int mod;
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NAL_6_Car a = new NAL_6_Car();
		NAL_6_Car b = new NAL_6_Car();
		NAL_6_Car c = new NAL_6_Car();
		
		a.mod = 2014;
		a.name = "Toyota Corolla";
		
		b.mod = 2022;
		b.name = "Toyota Fortuner";
		
		c.mod = 2025;
		c.name = "Mercedes S Class";
		
		
		System.out.println("Before assigning the references:");
		System.out.println(a.mod);
		System.out.println(a.name);
		
		System.out.println(b.mod);
		System.out.println(b.name);
		
		System.out.println(c.mod);
		System.out.println(c.name);

		System.out.println("After assigning the references:");
		c=a;
		a=b;
		b=c;
		
		System.out.println(a.mod);
		System.out.println(a.name);
		
		System.out.println(b.mod);
		System.out.println(b.name);
		
		System.out.println(c.mod);
		System.out.println(c.name);
	}

}
