package classesninterfaces.innerclasses;

public class Button {
	private String title; //Title for Button
	private OnClickListener onClickListener; //A declaration of onClickListerner, no reference

	//Constructor
	public Button(String title) {
		super();
		this.title = title;
	}

	//Getters of Title
	public String getTitle() {
		return title;
	}

	//Assigns onClickListener variable to any reference to an Object of a Class implementing onClickListener Interface
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
 
	//Passes the Class Object to Buttons hence having access to its onCLick method (incoming)
	//Although this method is using the same name, its called onClick method on the interface class
	public void onClick(){
		this.onClickListener.onClick(this.title); //Title from the Button name is passed in
		//However the method for set from the class method doesn't change.
		
	}

	//Interface 
	public interface OnClickListener{
		public void onClick(String title);
	}
	
}