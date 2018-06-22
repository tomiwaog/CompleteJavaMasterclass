package classesninterfaces.challenge;


public abstract class ListItem {
	protected ListItem rightLink = null;
	protected ListItem leftLink = null;
	
	protected Object value;

	public ListItem(Object value) {
		this.value = value;
	}
	
	public abstract ListItem next();
	public abstract ListItem setNext(ListItem item);
	public abstract ListItem previous();
	public abstract ListItem setPrevious(ListItem item);

	abstract int compareTo(ListItem newItem);
	

	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
/*	public int compareTo(ListItem item) {
		int comparison = this.compareTo(item);
		if (comparison == 0) {
			System.out.println("They are equal");
		} else if (comparison > 0) {
			System.out.println("Greater than incoming");
		}
		else{
			System.out.println("Less than incoming");
		}
		return comparison;
	}*/
}