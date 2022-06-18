package btDay4;

public class Day1JavaLanguage {

	// EX2
	public static void printString(String str) {

		System.out.println(str);

	}

	// EX3
	public static void printWeird(int n) {
		if (n % 2 == 1) {
			System.out.println("Weird");
		} else {
			if(n >= 6 && n <= 20) {
				System.out.println("Weird");
			} else {
				System.out.println("Not Weird");
			}
		}

	}
	
	// EX4
	public static void printProduct(int n) {
		for(int i = 1; i <= 10; i++) {
			int product = n * i;
			System.out.println("Gia tri " + n + " * " + i + " la " + product);
		}
	}
	
}
