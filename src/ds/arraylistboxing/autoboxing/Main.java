package ds.arraylistboxing.autoboxing;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<TomNumber> arr = new ArrayList<TomNumber>();
		
		for (int i = 0;i<10;i++){
			int randomNum = 0;
//			/int randomNum = RandNumGenerator.genRandNum();
			arr.add(TomNumber.valueOf(randomNum));
		}
		
		for (int i=0;i<arr.size();i++){
			System.out.println(i+ "-->"+arr.get(i).intValue());
		}
		
	}
}
