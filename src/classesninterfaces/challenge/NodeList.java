package classesninterfaces.challenge;

public interface NodeList {
	ListItem getRoot(); // Head of list

	boolean addItem(ListItem item);

	boolean removeItem(ListItem item);

	void traverse(ListItem root);
}
