import java.util.*;
public class MultiLevInheritance{
	public static void main(String[] args){
		Dog lester = new Dog();
		System.out.println("lester is dog and......lester->dog->mammal->Animal");
		lester.eat();
		lester.breath();
		lester.gland();
		lester.leg();
	}
}
class Animal{
	void eat(){
		System.out.println("EATS");
	}
	void breath(){
		System.out.println("BREATHS");
	}
}
class mammals extends Animal{
	void gland(){
		System.out.println("have mammary gland");
	}
}
class Dog extends mammals{
	void leg(){
		System.out.println("have 4 legs");
	}
}