package classesninterfaces.innerclasses.abstracts.challenge;

public class Main {

	public static void main(String[] args) {
		SearchTree list = new SearchTree(null);
		list.traverse(list.getRoot());
		
		String stringData = "5 7 3 9 8 2 1 0 4 6";
		
		String [] data = stringData.split(" ");
		for (String s: data){
			list.addItem(new Node(s));
		}
		list.traverse(list.getRoot());

		System.out.println("-------------------------------------------------------");
		list.removeItem(new Node("0"));
		list.removeItem(new Node("9"));
		list.removeItem(new Node("1"));
		list.removeItem(new Node("8"));
		list.removeItem(new Node("2"));
		list.removeItem(new Node("7"));
		list.removeItem(new Node("7"));
		list.removeItem(new Node("3"));
		//list.removeItem(new Node("5"));
		list.removeItem(new Node("6"));
		list.removeItem(new Node("4"));

		System.out.println("-------------------------------------------------------");

		list.traverse(list.getRoot());
	}
}
