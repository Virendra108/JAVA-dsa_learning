import java.util.*;
public class SingleInheritance{
	public static void main(String[] args){
		Dog tiger= new Dog();
		System.out.println("Tiger is a Dog");
		tiger.breath();
		tiger.eat();
		tiger.leg();
	}
}
class Animal{
	void breath(){
		System.out.println("breaths");
	}
	void eat(){
		System.out.println("eats");
	}
}
class Dog extends Animal{
	void leg(){
		System.out.println("have legs");
	}
}
