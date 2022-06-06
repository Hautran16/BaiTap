package common;
import BT.DataTypeAndVariable;
import BT.Operators;
import BT.DecisionMaking;

public class Main {

	public static void main(String[] args) {
		// Nếu trong ham không có static thì phải khởi tạo class
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
	}
	
}
