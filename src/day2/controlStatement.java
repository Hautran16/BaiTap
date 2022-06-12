package day2;

import java.security.PublicKey;
import java.util.Scanner;

public class controlStatement {
	
	public static void printDayOfWeek(int n) {
		switch (n) {
		case 2:
			System.out.print("Thu Hai");
			break;
		case 3:
			System.out.print("Thu Ba");
			break;
		case 4:
			System.out.print("Thu Tu");
			break;
		case 5:
			System.out.print("Thu Nam");
			break;
		case 6:
			System.out.print("Thu Sau");
			break;
		case 7:
			System.out.print("Thu Bay");
			break;
		case 8:
			System.out.print("Chu nhat");
			break;
			
		default:
			System.out.print("Nhap lai n");
			break;
		}
	}
	
	public static void sumAndAverage(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;		
		}
		System.out.println("The sum is " + sum );
		
		float ave = (float)(sum / n);
		System.out.print("The average is " + ave);
	}
	 // EX2 :
	
	public static void sumAndAverageEx2(int n1, int n2) {
		int sum = 0;
		int count = 0;
		for (int i = n1; i <= n2; i++) {
			count = count + 1;
			sum = sum + i;		
		}
		System.out.println("The sum is " + sum );
		
		double ave = (double)sum / (double)count;
		System.out.println("The average is " + Math.round(ave * 100.0)/ 100.0);
	}
	
	// EX3 : Tinh tong va gia tri trung binh cac so le
	
	public static void sumAndAverageEx3(int n1, int n2) {
		int sum = 0;
		int count = 0;
		for (int i = n1; i <= n2; i++) {
			if (i % 2 == 1) {
				count = count + 1;
				sum = sum + i;	
			}	
		}
		System.out.println("The sum is " + sum );
		
		double ave = (double)sum / (double)count;
		System.out.println("The average is " + Math.round(ave * 100.0)/ 100.0);
	}

	// EX4 : Tinh gia tri trung binh cac so chia het cho 7
	
	public static void sumAndAverageEx4(int n1, int n2) {
		int sum = 0;
		int count = 0;
		for (int i = n1; i <= n2; i++) {
			if (i % 7 == 0) {
				count = count + 1;
				sum = sum + i;	
			}	
		}
		System.out.println("The sum is " + sum );
		
		double ave = (double)sum / (double)count;
		System.out.println("The average is " + Math.round(ave * 100.0)/ 100.0);
	}
	
	// EX5: Tinh tong binh phuong cac so
	
	public static void sumAndAverageEx5(int n1, int n2) {
		int sum = 0;
		for (int i = n1; i <= n2; i++) {
			sum = sum + i * i;
		}
		System.out.println("The sum is " + sum );
		
	}
	
	// EX6 : Tinh tong chuoi dieu hoa
	
	public static void sumHarmonic(int n) {
		double sum1 = 0;
		for (int i = 1; i <= n; i++) {
			sum1 = sum1 + (double)1/(double)i ;
		}
		System.out.println("Tong tu trai sang phai la " + sum1);
		
		double sum2 = 0;
		for (int i = n; i >= 1; i--) {
			sum2 = sum2 + (double)1/(double)i ;
		}
		System.out.println("Tong tu phai sang trai la " + sum2);
	}
	
	// EX7 : in hinh dau #
	
	public static void SquareBoard(int n) {
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	// EX8 : in hinh dau #
	
	public static void CheckerBoard(int n) {
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n ; j++) {
				if (i % 2 == 1) {
					System.out.print(" #");
				} else
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	// While
	
	public static int searchByChar(String s) {
		int result = -1;
		// Khai bao mang 1 chieu kieu char co so phan tu toi da s.size 
		char[] helloArray = new char[s.length()];
		for ( int i = 0; i < s.length(); i++) {
			helloArray[i] = s.charAt(i);
		}
		int k = 0;
		while (k < s.length() - 1) {
			for ( int j = 0; j < helloArray.length - 1; j++) {
				if(helloArray[j] == 'r') {
					return result = j;
				} else {
					result = -1 ;
				}
			}
			k++;
		}
		
		return result;
	}
	
	// Method
	// EX1:
	
	public static boolean isOdd(int number) {
		boolean result = true;
		if (number % 2 == 0) {
			result = false;			
		}
		return result;
	}
	
	// EX2:
	
	public static boolean hasEight(int number) {
		boolean result = true ;
		String str = String.valueOf(number);
		String arr[] = str.split("");
		for (int i = 0; i < arr.length; i++) {
			String value = arr[i];
			int num = Integer.parseInt(value);
			if (num == 8) {
				return result = true;
			} else
				result = false;
		}
		
		return result;
	}
	
	// EX3:
	
	public static void MagicSum() {
		int number = 0;
		int sum = 0;
		while (number != -1) {
			System.out.print("Nhap mot so nguyen duong hoac -1 de thoat:  ");
			Scanner sc = new Scanner(System.in);
			number = sc.nextInt();		
			if (number != -1 ) {
				boolean result = hasEight(number);
				if ( result == true) {
					sum = sum + number;
				}
			}
		}
		
		System.out.println("Tong cac so chua so 8 la: " + sum);
	}
		

	// ARRAY
	// EX1:
		
	public static void GradesAverage() {
		int numStudents = 0;
		int sum = 0;
		int j = 0;
		System.out.print("Nhap so hoc sinh: ");
		Scanner sc = new Scanner(System.in);
		numStudents = sc.nextInt();
		int grades[] = new int[numStudents];
		for (int i = 0 ; i < grades.length; i++) {
			j++;
			System.out.print("Nhap diem hoc sinh thu " + j  + " ");
			grades[i] = sc.nextInt();
			while(grades[i] < 0 || grades[i] > 100) {
				System.out.println("Du lieu khong hop le, vui long nhap lai: ");
				System.out.print("Nhap diem hoc sinh thu " + j + " ");	
				grades[i] = sc.nextInt();
				}
			sum = sum + grades[i];				
			} 
		System.out.println("Diem trung ninh la: " + (float)sum/numStudents);
	}
	
	
	// EX2:
	
	public static void printArray(int[] array) {
		if(array.length > 0) {
			System.out.print("{");
			for(int i = 0; i <  array.length; i++) {
				if(i == array.length - 1) {
					System.out.print(array[i]);
				} else
				System.out.print(array[i] + ",");
			}
			System.out.println("}");
		} else {
			System.out.println("Mang khong co phan tu nao");
		}
	}
	
	// EX3:
	
	public static String arrayToString(int[] array) {
		String str = "";
		
		if(array.length > 0) {
			str = str + "{";
			for(int i = 0; i <  array.length; i++) {
				if(i == array.length - 1) {
					str = str + array[i];
					
				} else
					str = str + array[i] + ",";
			}
			str = str + "}";
		} else {
			str = "Mang khong co phan tu nao";
		}
		
		return str;
	}


}


