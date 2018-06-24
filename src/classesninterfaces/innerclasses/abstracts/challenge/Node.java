package classesninterfaces.innerclasses.abstracts.challenge;

public class Node extends ListItem {

	public Node(Object value) {
		super(value);
	}

	@Override
	public ListItem getNext() {
		return this.next;
	}

	@Override
	public ListItem getPrevious() {
		return this.previous;
	}

	@Override
	public ListItem setNext(ListItem item) {
		this.next = item;
		return this.next;
	}

	@Override
	public ListItem setPrevious(ListItem item) {
		this.previous = item;
		return this.previous;
	}

	@Override
	public int compareTo(ListItem listItem) {
		if (listItem!=null){
			return ((String)this.getValue()).compareTo(listItem.getValue().toString());
		}
		return -1;
	}

}
