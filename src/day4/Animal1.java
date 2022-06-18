package day4;

public class Animal1 {
	public String name;
	public String color;
	public int height;
	public int wide;

	// Constructor
	// Ten ham trung ten class
	// Khong co kieu tra ve = khong co void hoac return

	// Cach 1 : Constructor không có tham số

	public Animal1() {
		name = "Miu";
		color = "Vang";
		height = 30;
		wide = 100;

	}

	// Cach 1 : Constructor có tham số
	public Animal1(String constructorName, String constructorColor, int constructorheight, int constructorwide) {
		name = constructorName;
		color = constructorColor;
		height = constructorheight;
		wide = constructorwide;

	}

	public void shout() {
		System.out.println("Hello !! I'm " + this.name); // this được dùng trong method hoặc contructor
		System.out.println("I'm shouting !!!");
	}

	public void run() {
		System.out.println("I'm running ");
	}
}
