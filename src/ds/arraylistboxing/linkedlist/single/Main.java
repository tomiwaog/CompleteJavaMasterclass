package ds.arraylistboxing.linkedlist.single;

public class Main {

	public static void main(String[] args) {
		Link aries = new Link("1");
		LinkList list = new LinkList(aries);
		list.addLinkRear(new Link("3"));
		list.addLinkRear(new Link("2"));
		list.traverse(aries);
		System.out.println("---------------------");

		Link num = new Link("4");
		list = new LinkList(num);
		list.addLinkInOrder(new Link("3"));
		list.traverse(num);
		System.out.println("---------------------");
		list.addLinkInOrder(new Link("7"));

		list.addLinkInOrder(new Link("5"));
		list.traverse(num);
		System.out.println("---------------------");
		list.removeFirst();
		System.out.println("Just removed first");
		list.traverse(num);
		System.out.println("---------------------");System.out.println("Removed last");
		list.removeLast();
		list.traverse(num);
	}

}
