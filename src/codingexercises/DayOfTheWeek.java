package codingexercises;

public class DayOfTheWeek {

	public static void printDayOfTheWeek(int day) {
		String inputDay;
		switch (day) {
		case 0:
			inputDay = "Sunday";
			break;
		case 1:
			inputDay = "Monday";
			break;
		case 2:
			inputDay = "Tuesday";
			break;
		case 3:
			inputDay = "Wednesday";
			break;
		case 4:
			inputDay = "Thursday";
			break;
		case 5:
			inputDay = "Friday";
			break;
		case 6:
			inputDay = "Saturday";
			break;
		default:
			inputDay = "Invalid day";
			break;
		}
		System.out.println(inputDay);
	}

	public static void printDayOfTheWeek(int day, boolean overload) {
		String inputDay;
		if (day == 0)
			inputDay = "Sunday";
		else if (day == 1)
			inputDay = "Monday";
		else if (day == 2)
			inputDay = "Tuesday";
		else if (day == 3)
			inputDay = "Wednesday";
		else if (day == 4)
			inputDay = "Thursday";
		else if (day == 5)
			inputDay = "Friday";
		else if (day == 6)
			inputDay = "Saturday";
		else {
			inputDay = "Invalid day";
		}
		System.out.println(inputDay);
	}

	public static void main(String[] args) {
		printDayOfTheWeek(3);
		printDayOfTheWeek(3, true);
	}
}
