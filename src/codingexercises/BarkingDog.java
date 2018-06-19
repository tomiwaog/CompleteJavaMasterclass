package codingexercises;

public class BarkingDog {
	private String name;
	 
	public BarkingDog(String nameOfDog){
		 this.name = nameOfDog;
	 }
	 
	 public String getName(){
		 return name;
	 }
	 
	 public static boolean bark(boolean barking, int hourOfDay){
	     if (hourOfDay <0 || hourOfDay > 23){
	         return false;
	     }
	     if ((barking) &&(hourOfDay<8 || hourOfDay>22)){
	         return true;
	     }
	     return false;
	 }
	}
