package BT;

public class Operators {
	
	// EX1: tiny
	
	// EX2:
	
	public static void findpeed(float met, float hour, float min, float sec) {
		float speedMs = met / ( hour * 3600 + min * 60 + sec);
		float speedKh = (met / 1000) / (hour + min / 60 + sec / 3600);
		float speedMh = (met / 1609) / (hour + min / 60 + sec / 3600);
		
		System.out.println("Van toc M/s = " + speedMs);
		System.out.println("Van toc Km/h = " + speedKh);
		System.out.println("Van toc Miles/h = " + speedMh);
	}
	
	// EX3:

	public static void acceptsTwoIntegers(int a, int b) {
		int sum = a + b ;
		int dif = a - b ;
		int prd = a * b ; 
		float ave = ((float)a + (float)b) / 2 ;
		int dis = Math.abs(a - b);
		
		System.out.println("Tong 2 so = " + sum);
		System.out.println("Hieu 2 so = " + dif);
		System.out.println("Tich 2 so = " + prd);
		System.out.println("Trung binh 2 so = " + ave);
		System.out.println("Khoang cach 2 so = " + dis);
		if (dif > 0) {
			System.out.println("So lon = " + a);
			System.out.println("So nho = " + b);
		} else if (dif < 0) {
			System.out.println("So lon = " + b);
			System.out.println("So nho = " + a);
		} 
		else System.out.println("Hai so bang nhau");

	}
	
	// EX4:
	
	public static void breakInteger(int num) {
		String str = String.valueOf(num);
		String[] arr = str.split("");
		
		for (int i = 0; i < arr.length; i++) {
			String value = arr[i];
			int res = Integer.parseInt(value);
			System.out.println(res);
			}

	}

}
