package ds.arraylistboxing.linkedlist;

public abstract class ListItem {

	protected ListItem next;
	protected String signName;
	protected String signElement;

	public ListItem(String signName) {
		this(signName, "Unspecified Element");
	}

	public ListItem(String signName, String signElement) {
		this.signName = signName;
		this.signElement = signElement;
	}

	abstract String getData();
	abstract int compareTo(ListItem node);
	abstract ListItem getNext();
	public abstract ListItem setNext(ListItem item);
}
