import java.util.*;
public class HybridInheritance{
	public static void main(String[] args){
		Shark whiteshark = new Shark();
		System.out.println("White shark is shark and fish and anmal also but it is predator.... whiteshark->Shark->Fish->Animal");
		whiteshark.eat();
		whiteshark.breath();
		whiteshark.fins();
		whiteshark.pred();
		System.out.println();
		// so we cant acces tuna

		System.out.println("black tuna is tuna and fish and anmal also but it is non-predator.... blacktuna->Tuna->Fish->Animal");
		Tuna blacktuna = new Tuna();
		blacktuna.eat();
		blacktuna.breath();
		blacktuna.fins();
		blacktuna.nonpred();
		System.out.println();
		//so we cant acess shark

		System.out.println("Sameway for dog");
		Dog lester = new Dog();
		lester.eat();
		lester.breath();
		lester.gland();
		lester.bhaw();
		System.out.println();

		System.out.println("Sameway for cat");
		Cat xeo = new Cat();
		xeo.eat();
		xeo.breath();
		xeo.gland();
		xeo.mew();
		System.out.println();
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
class Fish extends Animal{
	void fins(){
		System.out.println("have fins to swim");
	}
}
class Mammals extends Animal{
	void gland(){
		System.out.println("have gland");
	}
}
class Cat extends Mammals{
	void mew(){
		System.out.println("mew");
	}
}
class Dog extends Mammals{
	void bhaw(){
		System.out.println("bhaw");
	}
}
class Shark extends Fish{
	void pred(){
		System.out.println("predator");
	}
}
class Tuna extends Fish{
	void nonpred(){
		System.out.println("non-predator");
	}
}
