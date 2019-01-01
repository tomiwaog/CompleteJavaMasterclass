package noteandpractice;
import java.util.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class Plant {
	Plant(String hey){
		
	}
}

class Tree extends Plant {

	Tree() {
		super("");
		System.out.println("Tree created");
	}

	Tree(String s) {
		this();
		System.out.println("Tree created : " + s);
	}
}

public class TestOld {
	public static void main(String[] args) {
		int num = 2*5+3*4-8;
		System.out.println("num is "+ num); //Operator precedence
		//Date dateo; //JVM prevents ambiguity, explicit import required
		//Tree tree = new Tree(" finally");
		int []array = new int[]{1,2,3,4,5,6};
		List<Integer> arrayList = new ArrayList<Integer>();
		for (int x : array){
			arrayList.add(x);
		}
		
		System.out.println("Array print:"+array.toString()); //Array Object toString isn't defined to print item list
		System.out.println("ArrayList print: " + arrayList.toString()); //ArrayList toString() is overridden to print items in object
		
		double x = 5;
		System.out.println(new TestOld().probe(x));
	}
	
	
	String probe(Integer x){
		return "An Integer";
	}
	
	String probe(Number x){
		return "A Number";
	}
	
	String probe(Object x){
		return "An Object";
	}
}
