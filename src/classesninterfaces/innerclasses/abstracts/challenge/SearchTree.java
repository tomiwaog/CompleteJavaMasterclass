package classesninterfaces.innerclasses.abstracts.challenge;

public class SearchTree implements NodeList {
	private ListItem root = null;

	public SearchTree(ListItem object) {
		this.root = object;
	}

	@Override
	public ListItem getRoot() {
		return root;
	}

	@Override
	public boolean addItem(ListItem incomingItem) {
		if (this.root == null) {
			this.root = incomingItem;
			return true;
		} else {
			ListItem currentItem = this.root;
			while (currentItem != null) {
				int comparison = currentItem.compareTo(incomingItem);

				if (comparison < 0) {
					// Incoming Item is greater
					if (currentItem.getNext() != null) {
						// If there's an item to the right, go to item
						currentItem = currentItem.next;
					} else {
						// There's no item in the right sibling, insert to right
						currentItem.setNext(incomingItem);
						return true;
					}
				} else if (comparison > 0) {
					// Current item is bigger than incoming item,
					if (currentItem.previous != null) {
						// If there's a left child, then move to left child
						currentItem = currentItem.previous;
					} else {
						// Otherwise insert at the location
						currentItem.setPrevious(incomingItem);
						return true;
					}
				} else {
					// if incoming is equal to current item
					System.out.println("Item is already present. Rejected");
					return false;
				}

			}

			return false;
		}

	}

	@Override
	public boolean removeItem(ListItem incomingItem) {
		// I did not code this
		if (incomingItem != null) {
			System.out.println("Deleting item " + incomingItem.getValue());
		}
		ListItem currentItem = this.root;
		ListItem parentItem = currentItem;

		while (currentItem != null) {
			int comparison = currentItem.compareTo(incomingItem);
			if (comparison < 0) {
				parentItem = currentItem;
				currentItem = currentItem.getNext();
			} else if (comparison > 0) {
				parentItem = currentItem;
				currentItem = currentItem.getPrevious();
			} else {
				// Current item is equal to incoming, Perform removal
				performRemoval(currentItem, parentItem);
				return true;
			}
		}
		return false;
	}

	private void performRemoval(ListItem item, ListItem parent) {
		// This is not my code
		// remove item from tree
		if (item.next == null) {
			// No right tree, so make parent point to left tree (may be null)
			if (parent.getNext() == item) {
				// Item is right child of parent
				parent.setNext(item.getPrevious());
			} else if (parent.getPrevious() == item) {
				// Item is left child of parent
				parent.setPrevious(item.getPrevious());
			} else {
				// Parent must be item the, meaning we're looking at root of
				// tree
				this.root = item.getPrevious();
			}
		} else if (item.previous == null) {
			// No left tree, make parent point to right of tree (may be null)
			if (parent.getNext() == item) {
				// Item is right child of parent
				parent.setNext(item.getNext());
			} else if (parent.getPrevious() == item) {
				// Item is left child of its parent
				parent.setPrevious(item.getNext());
			} else {
				// We are deleting root again
				this.root = item.getNext();
			}
		} else {
			// Neither left nor right are null, deletion becomes trickier.
			// From right subtree, find the smallest value(i.e. the leftmost)

			ListItem current = item.getNext();
			ListItem leftmostParent = item;
			while (current.getPrevious() != null) {
				leftmostParent = current;
				current = current.getPrevious();
			}

			// Now insert smallest value into our node to be deleted.
			item.setValue(current.getValue());
			// and delete the smallest
			if (leftmostParent == item) {
				// there was no leftmost mode, so current points to the
				// smallest.
				// node (the one that must now be deleted).
				item.setNext(current.getNext());
			} else {
				// sets the smallest node's parent to point to the smallest
				// node's right child(which may be null)
				leftmostParent.setPrevious(current.getNext());
			}
		}
	}

	@Override
	public void traverse(ListItem root) {
		if (root != null) {
			traverse(root.getPrevious());
			System.out.println(root.getValue());
			traverse(root.next);
		}
	}

}
