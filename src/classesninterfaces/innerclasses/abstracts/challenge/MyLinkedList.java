package classesninterfaces.innerclasses.abstracts.challenge;

public class MyLinkedList implements NodeList {
	ListItem root = null;

	public MyLinkedList(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean addItem(ListItem incomingItem) {
		// If List is already empty, assign root to first node
		if (this.root == null) {
			this.root = incomingItem;
			return true;
		}

		// Otherwise, start from root, insert listItem in appropriate location
		ListItem currentItem = this.root;
		while (currentItem != null) {
			int comparison = currentItem.compareTo(incomingItem);
			if (comparison == 0) {
				System.out.println(incomingItem.getValue() + " already Exist");
				return false;
			} else if (comparison > 0) {
				if (currentItem == this.root) {
					// swap root with incoming i.e. It has no previous
					incomingItem.setNext(this.root);
					this.root.setPrevious(incomingItem);
					this.root = incomingItem;
				} else {
					// incoming point next to [current]
					currentItem.previous.setNext(incomingItem);
					incomingItem.setPrevious(currentItem.previous);
					incomingItem.setNext(currentItem);
					currentItem.setPrevious(incomingItem);
				}
				return true;
			} else if (comparison < 0) {// if (comparison < 0)
				if (currentItem.next != null) {
					// if current item is less than incoming (incoming > current
					// item), we continue traversing
					// till incoming is less than current (current>incoming)
					currentItem = currentItem.getNext();
				} else {// means we reached the end of the list, incoming goes
						// to the end
					currentItem.setNext(incomingItem);
					incomingItem.setPrevious(currentItem);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean removeItem(ListItem listItem) {
		ListItem currentItem = this.root;
		while (currentItem != null) {
			int comparison = currentItem.compareTo(listItem);
			if (comparison == 0) {
				if (currentItem == root) {// if currentItem matches root
					this.root = currentItem.getNext();
					System.out.println(listItem.getValue() + " is deleted!");
					return true;
				}
				if (currentItem.next != null) {
					currentItem.getPrevious().setNext(currentItem.next);
					currentItem.next.setPrevious(currentItem.previous);
				} else {
					currentItem.getPrevious().setNext(null);
				}
				System.out.println(listItem.getValue() + " is deleted!");
				return true;
			} else if (comparison > 0) {
				System.out.println("Item not found in list");
				return false;
			} else {// comparison < 0 i.e. incoming is greater than current
				currentItem = currentItem.getNext();
			}
		}
		System.out.println(listItem.getValue() + " was not found in list");
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		if (root == null) {
			System.out.println("The list is empty!");
		} else {
			ListItem item = root;
			while (item != null) {
				System.out.println(item.getValue());
				item = item.getNext();
			}
		}
	}

}
