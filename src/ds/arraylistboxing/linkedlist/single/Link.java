package ds.arraylistboxing.linkedlist.single;

public class Link {
	String signName;
	Link next;
	
	Link(String name){
		this.signName = name;
	}
	Link setNext(Link incomingLink){
		return this.next = incomingLink;
	}
	Link getNext(){
		return next;
	}
	
	int compareTo(Link link){
		return (this.getValue().compareTo(link.getValue()));
	}
	
	String getValue(){
		return signName;
	}
}
