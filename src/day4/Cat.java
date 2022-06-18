package day4;

public class Cat extends Animal1{
	public String foodType;
	public Cat(String constructorName, String constructorColor, int constructorheight, int constructorwide) {
		name = constructorName;
		color = constructorColor;
		height = constructorheight;
		wide = constructorwide;

	} 
	
	public void display() {
		System.out.println("I'm " + this.name);
		System.out.println("I'm eating " + foodType);
	}
	
	// Overiding: Ghi đè
	// Giữ nguyên method và param
	public void shout() {
		System.out.println("I'm shout 2222222222");
	}
	
	// Overloading: Nap chồng
	// Giữ nguyên method và param
	public void shout(String x) {
		System.out.println("I'm shout 2222222222");
	}

}
