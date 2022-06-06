package BT;

public class DecisionMaking {

	public static void sumOfDigits(int num) {
		int sum = 0;
		String str = String.valueOf(num);
		String[] arr = str.split("");
		
		for (int i = 0; i < arr.length; i++) {
			String value = arr[i];
			int digit = Integer.parseInt(value);
			sum = sum + digit ;	
		}
		
		System.out.println("Tong cac chu so bang: " + sum);

	}
	
	public static void convertMinutes(int min) {
		int years = min / (365 * 24 * 60);
		int days = (min - years * (365 * 24 * 60)) / (24 * 60);
		
		System.out.println(min + " phut = " + years + " nam " + days + " ngay" );

	}

}
