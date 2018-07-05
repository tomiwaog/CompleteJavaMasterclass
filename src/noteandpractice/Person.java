package noteandpractice;

/** 
 * Object Classes utilises the equals() methods to see if references point to the same object
 * String Class overrides the equals() method to compare its primitive value rather than object ref
 */
import java.util.ArrayList;

import javax.jws.HandlerChain;

public class Person {

	private String name;

	Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Person) obj).name);
	}
	
	

	@Override
	public String toString() {
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
		//return name;
	}

	public static void main(String[] args) {
		
		//Converting ArrayList of Object to Array
		ArrayList<Object> anyList = new ArrayList<>();
		anyList.add(2);
		anyList.add("Name Joe");
		anyList.add(new Person("Michael"));
		
		Object[] rawArr = anyList.toArray(); //Conversion
		for (Object i: rawArr){
			if(i instanceof Person){
				System.out.println(((Person)i).getName());
			}else{
			System.out.println(i);
			}
		}

		
		//Several methods on the 
		//Return false, same will be tested with an array of class Person, and true is expected.
//		StringBuilder sb1 = new StringBuilder("Jan");
//		StringBuilder sb2 = new StringBuilder("Feb");
//
//		ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();
//		myArrList.add(sb1);
//		myArrList.add(sb2);
//		myArrList.add(sb2);
//		
//		System.out.println(myArrList.contains(new StringBuilder("Feb")));
		
//		ArrayList<Person> randomArr = new ArrayList<>();
//		Person me = new Person("Tom");
//		Person you = new Person("Tom");
//		randomArr.add(me);
//		randomArr.add(you);
//		//Uses overridden version of equals in Class Person, superclass version will return false.
//		System.out.println(me.equals(you));
//		
//		//Testing removal method arrayList based on specified equals() method in Person
//		ArrayList<Person> arr = new ArrayList<>();
//		Person p1 = new Person("Jay");
//		Person p2 = new Person("John");
//		Person p3 = new Person("Phillip");
//		System.out.println(p3);
//		System.out.println(p3.getClass().getName()+"@"+Integer.toHexString(p3.hashCode()));
//		arr.add(p1);
//		arr.add(p2);
//		arr.add(p3);
//		
//		System.out.println(arr.contains(new Person("Phillip"))); //Returns true, due to overwritten equals()
//		System.out.println(arr.indexOf(new Person("John"))); //Returns true
//		for(Person i: arr){
//			System.out.println(i.getName());
//		}
//		
		//Method below was able to remove entry as the equality method condition has changed.
		//Object class remove methods compares currentObjectinArray.equals(incoming i.e. criteria for deletion)
		//runs if curItem.equals("Jay"),equals method had been overridden on the curItem class
//		arr.remove(new Person("Jay"));
//		System.out.println();
//		for(Person i: arr){
//			System.out.println(i.getName());
//		}

		//testing Adding other collections to Arr
//		randomArr.addAll(1,arr); //inserts to position, can use without position specified
//		System.out.println("\nBegins collection addition:");
//		
//		for(Person i: randomArr){
//			System.out.println(i.getName());
//		}
//		
//		System.out.println("\nChecks if item added is still intact:");
//		for(Person i: arr){
//			System.out.println(i.getName());
//		}
	}
}
