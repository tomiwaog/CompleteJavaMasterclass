package noteandpractice;

public class TypeCasting {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		// In method overriding, methods execution is based on the runtime
		// object. but the variable is based on the Reference
		C c = new C();
		c.m1(); // Runtime object is C
		System.out.println(c.x);

		B b = ((B) c);
		b.m1(); // Runtime object is C
		System.out.println(b.x);

		A a = new A(); // Runtime object is A
		a.m1();
		System.out.println(a.x);

		A aa = new B();
		aa.m1(); // Runtime object is B
		System.out.println(aa.x);

		B bay = new B();
		A aab = ((A) bay);

		System.out.println("Casting A on B");
		aab.m1();
		System.out.println("Testing A on B for static method");
		aab.m2();

		B bb = new C();
		bb.m1(); // Runtime object is C
		System.out.println(bb.x);

		// execution is based on reference in Methods hiding, and variable
		// access.
		System.out.println("");
		A a2 = new A();
		a2.m2();
		System.out.println(a2.x);

		B b2 = new C();
		b2.m2();
		b2.m1();// This however would displayed C, as its not static
		System.out.println(b2.x);

		// //During type casting, new variable reference is create, object
		// remains the same.
		// Integer i = new Integer(4);
		// Number n = (Number)i;
		// Object o = (Object) i;
		// o = n;
		// n = (Number)o;
		//
		// System.out.println(i == n && i== o);
		// System.out.println(i);
		// System.out.println(n);
		// System.out.println(o);
		// if(i.equals(n) && i.equals(o)){
		// System.out.println("i, o and n : are equal");
		// }
		//
		// System.out.println("\nSTRING ANALYSIS");
		// String s = new String("Tom");
		// Object ob = (Object)s;
		//
		//
		// System.out.println(s ==ob);
		// System.out.println(s.equals(ob));
		// System.out.println(s);
		// System.out.println(ob);
	}
}

class A {
	int x = 777;

	void m1() {
		System.out.println("A");
	}

	static void m2() {
		System.out.println("M2 A");
	}
}

class B extends A {
	int x = 888;

	@Override
	void m1() {
		System.out.println("B");
	}

	static void m2() {
		System.out.println("M2 B");
	}
}

class C extends B {
	int x = 999;

	@Override
	void m1() {
		System.out.println("C");
	}

	static void m2() {
		System.out.println("M2 C");
	}
}
