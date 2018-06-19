package javamasterclass;

public class SwitchStatement {

	public static void main(String[] args) {

/*		int myValue =9;
		
		switch(myValue){
			case 1:
				System.out.println("val is 1");
				break;
			case 2: 
				System.out.println("val is 2");
				break;	
			case 3:case 4: case 5:
				System.out.println("val is 3 or 4 or 5");
				break;
			case 6:case 7:
				System.out.println("val is 6 or 7");
				break;
			case 8:
				System.out.println("val is 8");
				break;
			default:
				System.out.println("val is not 1 to 8");
				break; //break not necessary on default as its last case
		}*/
		
		char myLetter = 'e';
		switch(myLetter=Character.toUpperCase(myLetter)){
		case 'A':
			System.out.println("found A");
			break;
		case 'B':
			System.out.println("found B");
			break;
		case 'C':
			System.out.println("found C");
			break;
		case 'D': case 'E':
			System.out.print("found D or E");
			System.out.println(", actual was "+ myLetter);
			break;
		default:
			System.out.println(myLetter + " Not found");
			break;
		}
	}

}
