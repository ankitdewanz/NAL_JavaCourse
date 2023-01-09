package a4_Collections_ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

/*
* Course : Core Java Tutorials For Beginners - By Naveen AutomationLabs
* Video: ArrayList: Java Collections Framework Tutorial Part 2
* Video Link : https://www.youtube.com/watch?v=Plob9dBGyEY&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=18
*/

public class NAL_18_ArrayListConcepts {

	public static <E> void main(String[] args) {
		int a[] = new int[3]; //static array - size is fixed
		
		//dynamic array - ArrayList
		ArrayList ar = new ArrayList(); //0. Declare the Arraylist object and object refrence
		ar.add(10); //0 
		ar.add(20); //1
		ar.add(30); //2
		System.out.println(ar.size()); //1. size of the array
		ar.add(40); //3
		ar.add(50); //4
		ar.add(50); //5
		ar.add("Tom");
		ar.add(34.45);
		ar.add(true);
		
		System.out.println(ar.size()); //1. size of the array
		
		//Properties of array list 
		//1. It can contain duplicate values/elements.
		//2. Maintains insertion order.
		//3. Not Synchronized ( to be covered later) | Wrt multi threading concepts Not thread safe | arraylist is slow
		//4. Allows random access to fetch any element because it stores the values on the basis of indexes.
		
		System.out.println(ar.get(5)); //2. to give a value from the index
		
		//3. To print all the values of ArrayList
		//3.1 Use for loop
		System.out.print("Print ArrayList:");
		for (int i=0; i <ar.size() ; i++) {
			System.out.print(ar.get(i) + "|");
		}
		System.out.println();
		

		
		//4. Non-Generic vs Generic (Available after After JDK1.5)
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(32);
		//ar1.add("32"); Not allowed
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Thir is a string");
		
		ArrayList<E> ar3 = new ArrayList<E>();
		
		//5. Store class reference in ArrayList 
		//5.1 Creation of objects
		NAL_18_Employee e1 = new NAL_18_Employee("Ankit", 37, "QA");
		NAL_18_Employee e2 = new NAL_18_Employee("Nik", 37, "DEV");
		NAL_18_Employee e3 = new NAL_18_Employee("Evgenii", 37, "ADMIN");
		//5.2 Store in Arraylist
		ArrayList<NAL_18_Employee> ar4 = new ArrayList<NAL_18_Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
			//5.2 ->3.2 Use Iterator
		Iterator<NAL_18_Employee> it = ar4.iterator();
		while(it.hasNext()) {
			NAL_18_Employee emp = it.next();
			System.out.println(emp.name+"|"+emp.age+"|"+emp.dept);
		}
		
		//6. ArrayList Methods
		//6.1 addall()
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Ankit");
		ar5.add("Testing");
		ar5.add("QA");
		ar5.add("Citi");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Nik");
		ar6.add("JAVA");
		ar6.add("DEV");
		ar6.add("Citi");
		
		ar5.addAll(ar6);
		for (int i=0; i<ar5.size(); i++) {
			System.out.print(ar5.get(i)+"|");
		}
		System.out.println();

		//6.3 retainall()
		
		ar5.retainAll(ar6);
		for (int i=0; i<ar5.size(); i++) {
			System.out.print(ar5.get(i)+"|");
		}
		System.out.println();
		
		//6.2 removeall()
		ar5.add("test");
		ar5.removeAll(ar6);
		for (int i=0; i<ar5.size(); i++) {
			System.out.print(ar5.get(i)+"|");
		}
		System.out.println();
		

		
		
		
		

	}

}
