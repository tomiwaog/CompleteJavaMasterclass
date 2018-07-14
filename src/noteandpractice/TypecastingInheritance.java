package noteandpractice;

public class TypecastingInheritance {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.getObject().x);
	}
}

class Parent {
	int x = 10;

	public Parent getObject() {
		System.out.println("Called Parent");
		return new Parent();
	}
}

class Child extends Parent {
	int x = 20;

	public Child getObject() {
		System.out.println("Called Child");
		return new Child();
	}
}
