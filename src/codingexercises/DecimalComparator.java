package codingexercises;

public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces (double x, double y){
    	String xStr = Double.toString(x);
    	String yStr = Double.toString(y);
    	int xDot = xStr.indexOf('.');
    	int yDot = yStr.indexOf('.');
    	
    	if (xDot>-1 && (yDot > -1)){
    		if (xStr.length()- xDot  > 3){
    			xStr = xStr.substring(0, (xDot+4));
    		}
    		if (yStr.length() - yDot > 3){
    			yStr = yStr.substring(0, (yDot+4));
    		}
    	}
    	
    	return (xStr.equals(yStr));

    }
    
    
    public static void main(String [] args){
    	
    	System.out.println("Result : "+areEqualByThreeDecimalPlaces(480.326, 480.3261));
    }
}