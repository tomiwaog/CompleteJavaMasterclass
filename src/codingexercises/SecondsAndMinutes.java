
package codingexercises;

public class SecondsAndMinutes {

	private static String getDurationString (int minutes, int seconds){
		
		if (minutes>= 0 && seconds >=0 && seconds <=59){
			int getHours = minutes / 60;
			int remainMins = minutes % 60;
			String strGetHours = getHours+"h";
			String strGetRemMins = remainMins+"m";
			String strSeconds = seconds+"s";
			if (getHours<10){
				strGetHours = "0"+getHours;
			}if (remainMins <10){
				strGetRemMins = "0"+ remainMins;
			}if (seconds<10){
				strSeconds = "0"+seconds;
			}
			return strGetHours+"h "+strGetRemMins+" "+strSeconds;
		}
		return "invalid value";
	}
	
	private static String getDurationString (int seconds){
		if (seconds >0){
			return getDurationString(seconds / 60, seconds%60);
		}
		return "invalid value";
	}
	
	public static void main(String[] args) {
		//Main method
		System.out.println(getDurationString(65,45));
		System.out.println(getDurationString(3945));
	}
}
