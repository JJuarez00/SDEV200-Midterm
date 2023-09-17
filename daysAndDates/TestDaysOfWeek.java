// IMPORTANT: Look at google doc I put in the comments to view why I did what I did.
package daysAndDates;
        
public class TestDaysOfWeek {

	public static void main(String[] args) {
		System.out.println("Days Of week: ");

		for (int i = 0; i < 7;i++) {
			System.out.println("Number: " + i + "\tDay Of Week: " + DaysOfWeek.DayOfWeekStr(i) );
		}

	}

}
