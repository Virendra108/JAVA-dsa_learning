import java.util.*;
// java doesent supports multiple inheritance but it can be done using "immplements interface" so we will lear it later
// java doesent supports multiple inheritance but it can be done using "immplements interface" so we will lear it later
// java doesent supports multiple inheritance but it can be done using "immplements interface" so we will lear it later
// java doesent supports multiple inheritance but it can be done using "immplements interface" so we will lear it later
// java doesent supports multiple inheritance but it can be done using "immplements interface" so we will lear it later
public class MultipleInheritance{
	public static void main(String[] args){
		C third = new C();
		third.ft1();
		third.ft2();
		third.ft3();
	}
}
class A{
	void ft1(){
		System.out.println("feature of class A");
	}
}
class B{
	void ft2(){
		System.out.println("feature of class B");
	}
}

// java doesent supports multiple inheritance but it can be done using "immplements interface" so we will lear it later
class C extends A, B{
	void ft3(){
		System.out.println("feature of class C");
	}
}