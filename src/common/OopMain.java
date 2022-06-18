package common;

import day4.Animals;
import day4.Animal1;
import day4.Cat;

public class OopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//createObject();
		//creatObjectWithConstructor();
		//creatObjectWithConstructorPara();
		creatCatObject();

	}

	public static void createObject() {
		Animals dog = new Animals();
		dog.name = "Cun";
		dog.color = "Vang";
		dog.height = 30;
		dog.wide = 20;

		Animals cat = new Animals();
		cat.name = "Miu";
		cat.color = "Xam";
		cat.height = 10;
		cat.wide = 5;

		dog.shout();
		cat.shout();
		dog.run();
		cat.run();
	}
	
	public static void creatNullObject() {
		
	}
	
	// Khoi tao class co constructor
	public static void creatObjectWithConstructor() {
		Animal1 dog = new Animal1();
		dog.shout();	
		dog.run();
			
	}
	
	// Khoi tao class co constructor va tham so
	public static void creatObjectWithConstructorPara() {
		Animal1 dog = new Animal1("Cun", "Vang", 30, 20);
		Animal1 cat = new Animal1("Miu", "Xam", 30, 20);
		dog.shout();	
		dog.run();
		cat.shout();	
		cat.run();
			
	}
	
	// Su dung subclass 
	public static void creatCatObject() {
		Cat cat = new Cat("Miu", "Xam", 10, 20);
		cat.foodType = "Ca";
		cat.display();
		cat.shout();
		cat.run();
	}
	
	
}
