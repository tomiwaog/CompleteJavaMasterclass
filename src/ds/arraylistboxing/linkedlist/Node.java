package ds.arraylistboxing.linkedlist;

public class Node extends ListItem{
	
	public Node(String signName){
		super(signName);
	}
	
	public Node(String signName, String signElement){
		super(signName,signElement);
	}
	
	String getData(){
		return signName + " | "+ signElement;
	}

	@Override
	ListItem getNext() {
		return next;
	}

	@Override
	int compareTo(ListItem node) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListItem setNext(ListItem item) {
		// TODO Auto-generated method stub
		return null;
	}
}
