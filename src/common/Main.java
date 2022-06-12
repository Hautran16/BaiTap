package common;

import java.util.Scanner;

import BT.DataTypeAndVariable;
import BT.Operators;
import day2.controlStatement;
import BT.DecisionMaking;

public class Main {

	public static void main(String[] args) {
/*		// Nếu trong ham không có static thì phải khởi tạo class
		// Cách khỏi tạo

		// DataTypeAndVariable dataTypeAndVariable = new DataTypeAndVariable();
		// dataTypeAndVariable.printString("Hello world"));

		// ----- Cach 2: Ham co static ------

		DataTypeAndVariable.printString("hello world \n");

		// EX2:

		DataTypeAndVariable.printString("++++++ \n");
		DataTypeAndVariable.printString("@@@@@@ \n");
		DataTypeAndVariable.printString("****** \n");
		DataTypeAndVariable.printString("###### \n");

		// EX3:

		byte a = 10;
		float b = 20.3f;
		float c = 3.445556f;
		DataTypeAndVariable.printString("" + a);
		DataTypeAndVariable.printString("" + b);
		DataTypeAndVariable.printString("" + c);

		// EX4:

		boolean x = true;
		DataTypeAndVariable.printString("Before: " + x);
		x = false;
		DataTypeAndVariable.printString("After: " + x);

		// EX5:

		DataTypeAndVariable.convertFtoC(212.0f);

		// EX6:

		DataTypeAndVariable.convertInchtoMet(1000.0f);

		// ------ OPERATOR ----------

		// EX2:

		Operators.findpeed(2500, 5, 56, 23);

		// EX3:

		Operators.acceptsTwoIntegers(25, 5);

		// EX3:

		Operators.breakInteger(123456);

		// ------ Decision Making ----------

		// EX1:

		DecisionMaking.sumOfDigits(556);

		// EX2:

		DecisionMaking.convertMinutes(3456789);
*/
		
		// Switch - EX1:
		
//		System.out.print("Nhap n = \n");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		controlStatement.printDayOfWeek(n);
		
		// Switch - EX2:
		
		// Loop - EX1:
//		controlStatement.sumAndAverage(100);
		
		// Loop - EX2:
		controlStatement.sumAndAverageEx2(111, 8899);
		
		// Loop - EX3:
		controlStatement.sumAndAverageEx3(1, 100);
		
		// Loop - EX4:
		controlStatement.sumAndAverageEx4(1, 100);
		
		// Loop - EX5:
		controlStatement.sumAndAverageEx5(1, 100);
		
		// Loop - EX6:
		controlStatement.sumHarmonic(50000);
		
		// Loop - EX7:
		controlStatement.SquareBoard(5);
		
		// Loop - EX7:
		System.out.println("\nBai tap 8 \n");
		controlStatement.CheckerBoard(7);
	
		// While
		
		int index  = controlStatement.searchByChar("Hello world");
		if (index != -1) {
			System.out.println("\n Chi so cua r la : " + index + "\n");
		} else {
			System.out.println("Khong tim thay");
		}
		
		
		// Method
		// EX1
		
/*		System.out.print("Nhap n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean result = controlStatement.isOdd(n);
		if(result == true) {
			System.out.println("La so le (ODD) \n");
		} else
			System.out.println("La so chan (EVEN) \n");
*/

		// EX2:
		
		boolean result2 = controlStatement.hasEight(6767876);
		if(result2 == true) {
			System.out.println("Co chua so 8 \n");
		} else
			System.out.println("Khong chua so 8 \n");
	
		// EX3:
		
		//controlStatement.MagicSum();
		
		// ARRAY
		// EX1:
		
		// controlStatement.GradesAverage();
		
		// EX2:
		
		int[] array = new int[0];
//		array[0] = 2;
//		array[1] = 3;
		controlStatement.printArray(array);
		
		// EX3:
		
		int[] array2 = new int[2];
				array2[0] = 2;
				array2[1] = 3;
		System.out.println(controlStatement.arrayToString(array2));
		
		
		
	}
	

}
