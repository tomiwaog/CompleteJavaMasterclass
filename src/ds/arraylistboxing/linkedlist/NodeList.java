package ds.arraylistboxing.linkedlist;

public class NodeList implements List{
	ListItem firstNode; 
	
	NodeList(Node firstNode){
		this.firstNode = firstNode;
	}

	public boolean remove(List item) {
		// TODO Auto-generated method stub
		return false;
	}

	public void traverse() {
		ListItem currentItem = this.firstNode;
		while(currentItem !=null){
			System.out.println(currentItem.getData());
			currentItem = currentItem.next;
		}
	}

	@Override
	public void add(ListItem item) {
		if (firstNode == null){
			this.firstNode = item;
		}
		
	}

	@Override
	public boolean remove(ListItem item) {
		// TODO Auto-generated method stub
		return false;
	}
}
