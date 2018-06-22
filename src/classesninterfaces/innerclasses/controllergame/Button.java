package classesninterfaces.innerclasses.controllergame;

public class Button {
	private String title;
	private OnClickListener onClickListener;
	
	
	public Button(String buttonName){
		this.title = buttonName;
	}
	
	public void setOnClickListener(OnClickListener onClickListener){
		this.onClickListener = onClickListener;
	}
	public void onClick(){
		this.onClickListener.onClick(this.title);
	}

	public interface OnClickListener{
		public void onClick(String title);
	}
	
}
