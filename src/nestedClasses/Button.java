package nestedClasses;

public class Button {
	private String title;
	private OnClickListener onClickListener;

	public Button(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
 
	public void onClick(){
		this.onClickListener.onClick(this.title);
		
	}

	//Interface 
	public interface OnClickListener{
		public void onClick(String title);
	}
	
}