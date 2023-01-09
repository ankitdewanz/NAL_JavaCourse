package a1_JavaBasics;

/**
 * Video : 4 Naveen Automation Labs
 * Video Link : https://www.youtube.com/watch?v=LBgQBb5pxXs&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=5
 */

public class NAL_4_ArrayConcepts {

	/** Array : To store similar data type values in array variables. 
	 * @param args
	 * Disadvantages of array:
	 * 1. The size of an array is fixed at declaration. -> To overcome this problem, we can use Collections - ArrayList, Hashmaps - 
	 * also called dynamic array
	 * 2. Stores only similar data types -> To overcome this problem, we can use Object array. 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. integer array
		int ii[] = new int[3];
		ii[0] = 32;
		ii[1] = 42;
		ii[2] = 43;
		//i[3] = 65;
		System.out.println();
		System.out.print("Print the int array:");
		for (int i=0;i<ii.length;i++) {
		System.out.print(ii[i]+"|");
		}
		//System.out.println();
		
		//2. double array
		
		double d[] = new double[3];
		d[0] = 32.43;
		d[1] = 42.34;
		d[2] = 73.23;
		System.out.println();
		System.out.print("Print the double array:");
		for (int i=0;i<d.length;i++) {
			
			System.out.print(d[i]+"|");
		}
		//System.out.println();
		// 3. Boolean array 
		
		boolean b[] = new boolean[3];
		b[0] = true;
		b[1] = false;
		b[2] = true;
		System.out.println();
		System.out.print("Print the boolean array:");
		for (int i=0;i<b.length;i++) {
			
			System.out.print(b[i]+"|");
		}
		//System.out.println();
		
		//4. char array
		
		char c[] = new char[3];
		c[0] = 'd';
		c[1] = 'f';
		c[2] = 'M';
		System.out.println();
		System.out.print("Print the char array:");
		for (int i=0; i<c.length;i++) {
			System.out.print(c[i]+"|");
		}
		//System.out.println();
		
		// 5. String array  (String is a class)
		
		String s[] = new String[4];
		s[0]= "This is a 1st string";
		s[1]= "This is a 2nd string";
		s[2]= "This is a 3rd string";
		s[3]= "This is a 4th string";
		System.out.println();
		System.out.print("Print the String array:");
		for(int i=0; i < s.length ; i++) {
			System.out.print( s[i] + "|" );
		}		
		//6. Object Array (Object is a class)
		Object ob[] = new Object[3];
		ob[0] = "Tom";
		ob[1] = 'M';
		ob[2] = 43.45;
		System.out.println();
		System.out.print("Print the object array:");
		for(int i=0;i<ob.length;i++) {
			System.out.print(ob[i]+"|");
		}
		
		
	}

}
