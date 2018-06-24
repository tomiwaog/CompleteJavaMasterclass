package ds.arraylistboxing.linkedlist;

public class Main {

	public static void main(String[] args) {
		Node aries = new Node("Aries", "Fire Sign");
		System.out.println(aries.signElement);
		
		List list = new NodeList(aries);
		
		list.add(new Node("Taurus", "Earth Sign"));
		
		list.traverse();
	}
}
