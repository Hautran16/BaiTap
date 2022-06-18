package btDay4;

import java.util.Scanner;

public class HomeWork {

//********* JavaBasic ********

	// EX1:
	public static void printString(String str) {

		System.out.println(str);

	}

	// EX2:
	public static void printTwoVar(String str, float num) {
		str = "Java programming";
		System.out.println(str);
		num = 10;
		System.out.println(num);
		num = 12.5f;
		System.out.println(num);

	}

	// EX3:
	public static void convertStringToInt(String str) {
		int num = Integer.parseInt(str);
		System.out.println(num);
	}

	// EX4:
	public static void printAverage(float priceLaptop, float pricePC, float pricePro) {
		float ave = (priceLaptop + pricePC + pricePro) / 3;
		System.out.println("Gia tri trung binh la: " + ave);
	}

	// EX5:
	public static void convertStringMoney(String str) {
		char s = str.charAt(str.length() - 1);
		String str2 = str.substring(0, str.length() - 1);
		str = s + str2;
		System.out.println(str);

	}

	// EX6:
	public static void replaceCharacters(String str) {
		str = str.trim();
		str = str.replace(" ", "-");
		System.out.println(str);
	}

	// EX7:
	public static void compare2String(String actual) {
		String expected = "abc";
		if (actual.equals(expected)) {
			System.out.println("TC passed");
		} else
			System.out.println("TC failed");
	}

	// EX8:
	public static void printAge() {
		System.out.print("Nhap tuoi cua ban: ");
		Scanner sc = new Scanner(System.in);
		int ave = sc.nextInt();
		if (ave >= 18) {
			System.out.println("Du dieu kien bo phieu");
		} else
			System.out.println("Khong Du dieu kien bo phieu");
	}

	// EX9:
	public static void determineNummber(int num) {
		if (num % 2 == 0) {
			System.out.println("La so chan ");
		} else
			System.out.println("Khong la so chan ");
	}

	// EX10:
	public static void determineGrade(float quiz, float midTterm, float finalScore) {
		float ave = (quiz + midTterm + finalScore) / 3;
		if (ave >= 90) {
			System.out.println("Diem A ");
		} else if (ave >= 70) {
			System.out.println("Diem B ");
		} else if (ave >= 50) {
			System.out.println("Diem C ");
		} else
			System.out.println("Diem D ");
	}

	// EX11:
	public static void calculateRevenue() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap don gia: ");
		float price = sc.nextFloat();
		System.out.print("Nhap so luong: ");
		float quantity = sc.nextFloat();
		float revenue = price * quantity;
		System.out.println("Doanh thu tu ban hang la: " + revenue);
		if (quantity > 120) {
			revenue = (float) (revenue - 0.15 * revenue);
			System.out.println("Doanh thu sau chiet khau la: " + revenue);
		} else if (quantity >= 100) {
			revenue = (float) (revenue - 0.1 * revenue);
			System.out.println("Doanh thu sau chiet khau la: " + revenue);
		} else
			System.out.println("Khong chiet khau");
	}

	// EX12:
	public static void detectKey() {
		System.out.print("Nhap cac so tu 0 den 9: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num >= 0 && num <= 9) {
			System.out.println(num);
		} else
			System.out.println("Khong duoc phep");
	}

	// EX13:
	public static void chooseAnswer() {
		System.out.println(
			"What is the correct way to declare a variable to store an integer value in Java?\n"
			+ "a. int 1x=10;\n"
			+ "b. int x=10;\n"
			+ "c. float x=10.0f;\n"
			+ "d. string x=\"10\";\n"
			+ "");
		System.out.print("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		String result = sc.nextLine();
		if(result.equals("c")) {
			System.out.println("Correct");
		} else
			System.out.println("Incorrect");
	}

	// EX14
	public static void printResult(int num) {
		for (int i = num - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// EX15
	public static void printResult2(int num, int total) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			for (int k = 0; k < total - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// EX16:
	public static void question() {
		System.out.println("" + "What is the command keyword to exit a loop in Java?\n" + "a. int\n" + "b. continue\n"
				+ "c. break\n" + "d. exit\n" + "");
		// chooseTheCorrectAnswer();
		chooseTheCorrectAnswer2();
	}
		// Dùng if...else + đệ quy
	public static void chooseTheCorrectAnswer() {
		System.out.print("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (!s.equals("b")) {
			System.out.println("Incorrect!");
			System.out.print("Again? press y to continue: ");
			String s2 = sc.nextLine();
			if (s2.equals("y")) {
				chooseTheCorrectAnswer();
				return;
			} else {
				System.out.println("Stopped");
				return;
			}
		}
		System.out.println("Correct!");
	}
		// Dùng while()
	public static void chooseTheCorrectAnswer2() {
		System.out.print("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		while (!s.equals("c")) {
			System.out.println("Incorrect!");
			System.out.print("Again? press y to continue: ");
			String s2 = sc.nextLine();
			while (!s2.equals("y")) {
				System.out.print("Press y to continue: ");
				s2 = sc.nextLine();
			}
			System.out.print("Enter your choice: ");
			s = sc.nextLine();
		}
		System.out.println("Correct!");
	}

	// EX17: Dung FOR
	public static void printTable1() {
		System.out.println(" In ky tu ");
		for(int i = 1; i<= 122; i++) {
			char ascii = (char)i;
			System.out.print(ascii);
			if(i % 10 == 0)
				System.out.println();
		}
	}
	
	// EX18: Dùng do...while()
	public static void chooseTheCorrectAnswerUseDoWhile() {
		Scanner sc = new Scanner(System.in);
		String s = "";
		do {
			if(!s.equals("")) {
				System.out.println("Incorrect!");
				System.out.print("Again? press y to continue: ");
				String s2 = sc.nextLine();
				while (!s2.equals("y")) {
					System.out.print("Press y to continue: ");
					s2 = sc.nextLine();
				}
			}
			System.out.print("Enter your choice: ");
			s = sc.nextLine();
		} while (!s.equals("c"));
		System.out.println("Correct!");		
	}
	
	// EX19:  Dùng do...while()
	public static void printTable2() {
		System.out.println(" In ky tu ");
		int i = 1;
		do {
			char ascii = (char) i;
			System.out.print(ascii + " ");
			if (i % 10 == 0) {
				System.out.println();
			}
			i++;
		} while (i <= 122);
	}

}
