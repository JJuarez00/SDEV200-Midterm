// IMPORTANT: Look at google doc I put in the comments to view why I did what I did.
package daysAndDates;

public class DaysOfWeek {
	public static String DayOfWeekStr(int NumberOfDay) {
		String dayStr = "";
		switch (NumberOfDay) {
			case 0 -> dayStr = "Sunday";
			case 1 -> dayStr = "Monday";
			case 2 -> dayStr = "Tuesday";
			case 3 -> dayStr = "Wednesday";
			case 4 -> dayStr = "Thursday";
			case 5 -> dayStr = "Friday";
			case 6 -> dayStr = "Saturday";
		}
                return dayStr;
	}
}
