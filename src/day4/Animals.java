package day4;

// Class khong co constructor
public class Animals {
	public String name;
	public String color;
	public int height;
	public int wide;

	public void shout() {
		//
		System.out.println("Hello !! I'm " + this.name); // this được dùng trong method hoặc contructor
		System.out.println("I'm shouting !!!");
	}

	public void run() {

		//
		System.out.println("I'm running ");
	}

}
