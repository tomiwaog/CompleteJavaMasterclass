package classesninterfaces.innerclasses;

public class Tom implements Button.OnClickListener{

	public Tom(){
		System.out.println("Tom Constructor launched");
	}
	
	@Override
	public void onClick(String title) {
		System.out.println("Tom input: "+ title.toUpperCase());
		
	}

}
