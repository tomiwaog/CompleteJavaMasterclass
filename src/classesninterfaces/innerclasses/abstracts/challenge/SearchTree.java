package classesninterfaces.innerclasses.abstracts.challenge;

public class SearchTree implements NodeList {
	private ListItem root=null;

	
	public SearchTree(ListItem object) {
		this.root = object;
	}

	@Override
	public ListItem getRoot() {
		return root;
	}

	@Override
	public boolean addItem(ListItem listItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeItem(ListItem listItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		// TODO Auto-generated method stub

	}

}
