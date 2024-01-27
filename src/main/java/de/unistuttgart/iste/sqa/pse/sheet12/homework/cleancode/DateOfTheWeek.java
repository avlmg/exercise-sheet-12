package de.unistuttgart.iste.sqa.pse.sheet12.homework.cleancode;

import static java.lang.Integer.parseInt;

import java.util.Calendar;
import java.util.Scanner;

/**
 * A program to calculate the day of the week for a given date.
 */
public class DateOfTheWeek {

	static final String[] weekDays = new String[] {"Sun", "Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur"};
	static final int MONTH_OFFSET = 1;

	/**
	 * Sets the provided date in the given calendar object.
	 *
	 * @param calendar The Calendar object to set the date in.
	 * @param date The date string in the format "YYYY-MM-DD", "YYYY.MM.DD", or "YYYY/MM/DD".
	 * @param sep The separator used in the date string ("/", "-", or ".").
	 */
	static void setCalendarDate(final Calendar calendar, final String date, final String sep) {
		final String[] dateComponents = date.split(sep);
		calendar.set(parseInt(dateComponents[0]), parseInt(dateComponents[1]) - MONTH_OFFSET, parseInt(dateComponents[2]));
	}

	/**
	 * Main method to execute the program.
	 *
	 * @param args .
	 */
	public static void main(final String[] args) {
		final Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Date in format YYYY-MM-DD, YYY/MM/DD or YYYY.: (press enter to confirm)");
		final String input = scanner.nextLine();
		final Calendar calendar = Calendar.getInstance();
		if (input.contains("-")) {
			setCalendarDate(calendar, input, "-");
		} else if (input.contains("/")) {
			setCalendarDate(calendar, input, "/");
		} else if (input.contains(".")) {
			setCalendarDate(calendar, input, "\\.");
		}
		final int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.printf("Day of the week: %sday\n", weekDays[weekDay - 1]);
	}
}
