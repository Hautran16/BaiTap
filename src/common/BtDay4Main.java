package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import btDay4.Day1JavaLanguage;
import btDay4.Day3DataStructure;
import btDay4.HomeWork;

public class BtDay4Main {

	public static void main(String[] args) throws ParseException {

//**************** Day 1 *****************	
		// EX2:
		Day1JavaLanguage.printString("Hello, World.");
		Day1JavaLanguage.printString("Hello, Java.");

		// EX3:
		Day1JavaLanguage.printWeird(22);

		// EX4:
//		Day1JaveLanguage.printProduct(5);

//**************** Day 3 *****************		

		// EX5
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		Day3DataStructure.printSizeArray(arr);

		// EX6:
//		int[] arr1 = new int[3];
//		arr1[0] = 1;
//		arr1[1] = 2;
//		arr1[2] = 3;

//		int[] arr1 = {1,2,3,4,5,6};
//		Day3DataStructure.printDigit(arr1);

		// EX7:
		Day3DataStructure.printArray2D();

// ******* Java Practices Day 3 *********

		// EX1:
		Day3DataStructure.generateRandomString();

		// EX2:
		Day3DataStructure.displayInformation();

		// EX3:
		Day3DataStructure.compareDate("11-05-2025", "12-05-2025");
		
		// EX4:
		Day3DataStructure.displayTheDates();

//********* JavaBasic ********	

		// EX1:
		HomeWork.printString("*****");
		HomeWork.printString("*****");
		HomeWork.printString("*****");
		HomeWork.printString("*****");
		HomeWork.printString("*****");

		// EX2:
		HomeWork.printTwoVar(null, 0);

		// EX3:
		HomeWork.convertStringToInt("20");

		// EX4:
		HomeWork.printAverage(20, 20, 30);

		// EX5:
		HomeWork.convertStringMoney("2000$");

		// EX6:
		HomeWork.replaceCharacters("     Welcome to Java Basic    ");

//********* Condition statements ********		

		// EX7:
		HomeWork.compare2String("abc");

		// EX8:
//		HomeWork.printAge();

		// EX9:
		HomeWork.determineNummber(11);

		// EX10:
		HomeWork.determineGrade(9, 9, 69);

		// EX11:
//		HomeWork.calculateRevenue();

		// EX12:
//		HomeWork.detectKey();

		// EX13:
//		HomeWork.chooseAnswer();

		// EX14:
		HomeWork.printResult(7);

		// EX15:
		HomeWork.printResult2(3, 7);

		// EX16:
//		HomeWork.question();

		// EX17;
		HomeWork.printTable1();

		// EX18:
//		HomeWork.chooseTheCorrectAnswerUseDoWhile();

		// EX17;
//		HomeWork.printTable2();

	}

}
