package btDay4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Day3DataStructure {

	// EX5:
	public static void printSizeArray(int[] arr) {
		System.out.println(arr.length);
	}

	// EX6:
	public static void printDigit(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// EX7:
	public static void printNumber() {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < 8; i++) {
			System.out.println(numbers[i]);
		}

	}

	// EX8:

	public static void printArray2D() {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[][] numbers2 = new int[3][3];
		int k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				numbers2[i][j] = numbers[k];
				k++;
				System.out.print(numbers2[i][j]);
			}
			System.out.println();
		}

	}

	// ******* Java Practices Day 3 *********

	// EX1:
	public static void generateRandomString() {
		Random random = new Random();
		int num = random.nextInt(0, 7000);
		System.out.println("Yourname_" + num);
	}

	// EX2:
	public static void displayInformation() {
		Calendar cal = Calendar.getInstance();
		System.out.println("Year " + cal.get(Calendar.YEAR));
		System.out.println("Month " + cal.get(Calendar.MONTH));
		System.out.println("Date " + cal.get(Calendar.DATE));
		System.out.println("Hour " + cal.get(Calendar.HOUR));
		System.out.println("Minute " + cal.get(Calendar.MINUTE));
		System.out.println("Second " + cal.get(Calendar.SECOND));
	}

	// EX3:
	public static void compareDate(String day1, String day2) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date1 = simpleDateFormat.parse(day1);
		Date date2 = simpleDateFormat.parse(day2);
		if (date1.compareTo(date2) < 0) {
			System.out.println(day1 + " < " + day2);
		} else if (date1.compareTo(date2) > 0) {
			System.out.println(day1 + " > " + day2);

		} else
			System.out.println("Hai ngay bang nhau");
	}
	
	// EX4:
	public static void displayTheDates() {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
		SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("HH.mm.ss.SSS");
		SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss.SSS");
		SimpleDateFormat simpleDateFormat6 = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss.SSS Z");
		System.out.println(simpleDateFormat1.format(date));
		System.out.println(simpleDateFormat2.format(date));
		System.out.println(simpleDateFormat3.format(date));
		System.out.println(simpleDateFormat4.format(date));
		System.out.println(simpleDateFormat5.format(date));
		System.out.println(simpleDateFormat6.format(date));
		
	}
}
