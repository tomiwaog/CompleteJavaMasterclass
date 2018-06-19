package abstractChallenge;

public class MyLinkedList implements NodeList {
	private ListItem root = null;

	public MyLinkedList(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean addItem(ListItem newItem) { // Insertion Method with ordering
		if (newItem == null) {
			return false; // Avoid null insertions
		}
		if (this.root == null) {// empty list
			this.root = newItem; // items becomes head
			return true;
		}
		// If List already contain 1 or more Items i.e NOT EMPTY
		ListItem currentItem = this.root; // Starts pointing from Root
		while (currentItem != null) {// Comparable Item is not null
			int comparison = currentItem.compareTo(newItem);

			if (comparison < 0) {
				// If currItem < new Item
				if (currentItem.next() != null) {
					currentItem = currentItem.next();// Move to next Item
				} else {
					// No Next = End of LinkedList Insert after current Item
					// If new Item is greater
					currentItem.setNext(newItem);
					newItem.setPrevious(currentItem);
					// currentItem.setNext(newItem).setPrevious(currentItem);//better
					// code
					return true;
				}
			} else if (comparison > 0) {
				// if Current Item > new Item i.e. NEW ITEM < current
				if (currentItem.previous() == null) {
					// When insertion is required at the start of the list
					newItem.setNext(this.root);
					this.root.setPrevious(newItem);
					this.root = newItem; // Head node replaced
					// this.root =
					// newItem.setNext(this.root).setPrevious(newItem);///Alternative
					// Better code
					// true;
				} else {
					// If previous item exist (!= null)
					// Item before Current item is attached to new item and new
					// item before Current Item
					currentItem.previous().setNext(newItem);
					newItem.setPrevious(currentItem.previous());
					// currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());//Better
					// but complex
					newItem.setNext(currentItem).setPrevious(newItem); // in
																		// action
					// true;
				}
				return true; // In both cases: (comparison>0) True is returned
			} else {
				// Item are equal. i.e. current Item equates to new item
				boolean duplicatesAllowed = false; // Local option for duplicate

				if (duplicatesAllowed) {
					newItem.setNext(currentItem.next());
					currentItem.setNext(newItem);
					newItem.setPrevious(currentItem);
					newItem.next().setPrevious(newItem);
					return true;
				} else {
					System.out
							.println(newItem.getValue()
									+ " is already present, Duplicated not allowed, hence not added!");
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean removeItem(ListItem item) {
		if (this.root == null) {
			System.out.println("List is empty!");
			return false;
		}
		ListItem currentItem = root;

		while (currentItem != null) {
			int comparison = currentItem.compareTo(item);
			if (comparison == 0) {
				String itemName = item.getValue().toString();
				if (currentItem == this.root) {
					this.root = root.next();
					this.root.setPrevious(null);
					System.out.println("Root deleted!");
				} else {
					currentItem.previous().setNext(currentItem.next()); //if last item, will also point to NULL
					if (currentItem.next()!=null){
						//Links back if the Item is not NULL pointer.
						currentItem.next().setPrevious(currentItem.previous());
					}
					System.out.println(itemName+ " has been deleted!");
				}
				return true;
			}
			if (comparison <0){
			currentItem = currentItem.next();
			}else{//comparison > 0
				//No point iterating through the list in a sorted LinkedList
				//Now impossible to find and delete Item if Item is less than index i.e. Index is High than incoming Item
				return false;
			}
		}
		System.out.println("Not found, hence not Deleted!\n");
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		ListItem currItem = root;
		if (root == null) {
			System.out.println("The list is empty!");
		} else {
			System.out.println("**************");
			while (currItem != null) {
				System.out.println(currItem.getValue());
				currItem = currItem.next();
			}
			System.out.println("**************");
		}
	}
}
