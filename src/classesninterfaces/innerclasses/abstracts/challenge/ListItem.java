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
	public abstract void setNext(ListItem item);
	public abstract void setPrevious(ListItem item);
	public abstract int compareTo(ListItem listItem);
}