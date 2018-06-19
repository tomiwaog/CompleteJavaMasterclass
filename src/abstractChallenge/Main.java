package abstractChallenge;

public class Main {

	public static void main(String[] args) {

		MyLinkedList myList = new MyLinkedList(null);
		String strText = "Darwin Brisane Perth Melbourne Canberra Adelaide Sydney Canberra";

		//Null insertion test
		if (myList.addItem(null)) {
			System.out.println("NULL added succesfuly");
		} else {
			System.out.println("NULL insertion failed!");
		}
		String[] strTextArr = strText.split(" "); // Splits text in array
		for (String x : strTextArr) {
			// Insert content of array index to myList
			 myList.addItem(new Node(x));
		}

		myList.traverse(myList.getRoot());
		
		myList.removeItem(new Node("Darwin"));
		myList.traverse(myList.getRoot());
	}
}
