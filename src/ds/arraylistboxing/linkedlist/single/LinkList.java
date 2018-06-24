package ds.arraylistboxing.linkedlist.single;

public class LinkList {
	private Link head = null;

	LinkList(Link firstLink) {
		this.head = firstLink;
	}

	Link getRoot() {
		return head;
	}

	boolean addLinkRear(Link incomingLink) {
		if (head == null) {
			head = incomingLink;
			return true;
		}
		Link currentLink = head;
		while (incomingLink != null) {
			if (currentLink.getNext() == null) {
				currentLink.setNext(incomingLink);
				return true;
			}
			currentLink = currentLink.getNext();
		}

		return true;
	}

	boolean addLinkInOrder(Link incomingLink) {
		if (head == null) {
			this.head = incomingLink;
			return true;
		}
		Link currentLink = this.head;
		while (currentLink != null) {
			int comparison = currentLink.compareTo(incomingLink);
			if (comparison < 0) { // Current is less than incoming
				if (currentLink.next != null) { // If there's a next item,
												// insert in between current and
												// next
					if (incomingLink.compareTo(currentLink.next) < 0) {
						// Insert here
						incomingLink.setNext(currentLink.next);
						currentLink.setNext(incomingLink);
						return true;
					}
					// Otherwise continue if incoming is larger than
					// current.next()
				} else {
					// If next is null. insert right there.
					currentLink.setNext(incomingLink);
					return true;
				}

			} else if (comparison > 0) {
				// Current is greater than incoming
				if (currentLink == head) {
					System.out.println("incoming is " + incomingLink.getValue()
							+ " and current is " + currentLink.getValue());
					incomingLink.next = this.head;
					this.head = incomingLink;
					return true;
				} else {

				}
			}
			currentLink = currentLink.next;
		}
		return false;
	}

	void traverse(Link link) {
		link = this.head;
		while (link != null) {
			System.out.println(link.getValue());
			link = link.getNext();
		}
	}
}
