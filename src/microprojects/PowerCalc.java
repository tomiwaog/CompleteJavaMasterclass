package microprojects;

public class PowerCalc {

	static long calcPower(int x, int y){
		long sum= x;
		for (int i=0;i<(y-1);i++){
			sum*=x;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(calcPower(2,7));
	}

}
