package btDay4;

public class Day3DataStructure {
	
	// EX5:
	public static void printSizeArray(int[] arr) {
		System.out.println(arr.length);
	}
	
	// EX6:	
	public static void printDigit(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	// EX7:
	public static void printNumber() {
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		for(int i = 0; i < 8; i++){
			System.out.println(numbers[i]);
		}

	}
	
	// EX8:
	
	public static void printArray2D() {
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		int[][] numbers2 = new int[3][3] ;
		int k = 0;
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j < 3; j++) {
				numbers2[i][j] = numbers[k];
				k++;
				System.out.print(numbers2[i][j]);
			}
			System.out.println();
		}
		 
	}
	
	
	
}
