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
				
				if (comparison <0){
					//Incoming Item is greater
					if (currentItem.getNext()!=null){
						// If there's an item to the right, go to item
						currentItem = currentItem.next; 
					}else{
						//There's no item in the right sibling, insert to right
						currentItem.setNext(incomingItem);
						return true;
					}
				}
				else if (comparison >0){
					//Current item is bigger than incoming item, 
					if (currentItem.previous!=null){
						//If there's a left child, then move to left child
						currentItem = currentItem.previous;
					}else{
						//Otherwise insert at the location
						currentItem.setPrevious(incomingItem);
						return true;
					}
				}
				else{
					//if incoming is equal to current item
					System.out.println("Item is already present. Rejected");
					return false;
				}

			}

			return false;
		}

	}

	@Override
	public boolean removeItem(ListItem listItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		if (root!=null){
			traverse(root.getPrevious());
			System.out.println(root.getValue());
			traverse(root.next);
		}
	}

}
