package noteandpractice;

import java.util.ArrayList;

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

	public static void main(String[] args) {
		Person me = new Person("Tom");
		Person you = new Person("Tom");
		
		//Uses overridden version of equals in Class Person, superclass version will return false.
		System.out.println(me.equals(you));
		
		//Testing removal method arrayList based on specified equals() method in Person
		ArrayList<Person> arr = new ArrayList<>();
		Person p1 = new Person("Jay");
		Person p2 = new Person("John");
		Person p3 = new Person("Phillip");
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		
		for(Person i: arr){
			System.out.println(i.getName());
		}
		//Method below was able to remove entry as the equality method condition has changed.
		//Object class remove methods compares currentObjectinArray.equals(incoming i.e. criteria for deletion)
		//runs if curItem.equals("Jay"),equals method had been overridden on the curItem class
		arr.remove(new Person("Jay"));
		System.out.println();
		for(Person i: arr){
			System.out.println(i.getName());
		}

	}
}
