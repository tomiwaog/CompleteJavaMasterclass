package classesninterfaces.innerclasses.abstracts.challenge;

public abstract class ListItem {
	protected ListItem next = null;
	protected ListItem previous;

	protected Object value;

	public ListItem(Object value) {
		this.value = value;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public abstract ListItem getNext();
	public abstract ListItem getPrevious();
	public abstract ListItem setNext(ListItem item);
	public abstract ListItem setPrevious(ListItem item);
	public abstract int compareTo(ListItem listItem);
}