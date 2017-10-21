package Projects;

//Utilising Overloading
public class FeetInchesToCm {

	public static void main(String[] args) {
		double tomInch = calcFtInchesToCm(5,6);
		System.out.println(tomInch + " cm");
		double tomData = calcFtInchesToCm(-10);
		System.out.println("No ft given. "+tomData + " cm");
	}

	public static double calcFtInchesToCm(int feet, int inches) {
		if (feet >= 0 && inches >= 0 && inches <= 12) {
			int inchCal = (feet*12)+inches; //feet to inches
			double totalCm = (inchCal * 2.54); //(ft to inches)to cm
			return totalCm;
		} else
			return -1;
	}
	
	public static double calcFtInchesToCm(int inches){
		
		if (inches >=0){
			int feet = inches/12;
			inches = inches%feet;
			System.out.println(feet+ " ft "+inches + " inches");
			double recalc= calcFtInchesToCm(feet,inches);
			return recalc;
		}
		return -1;
	}
}
