import java.util.*;
public class HierarchicalInheritance{
	public static void main(String[] args){
		Fish shark = new Fish();
		System.out.println("Shark is fish and also animal but not mammal so it can have this prperties");
		shark.eat();
		shark.breath();
		shark.fins();
		// so we cant acces gland function

		System.out.println("human is mammal and also animal but not Fish so it can have this prperties");
		Mammals human = new Mammals();
		human.eat();
		human.breath();
		human.gland();
		//so we can acess fins function
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