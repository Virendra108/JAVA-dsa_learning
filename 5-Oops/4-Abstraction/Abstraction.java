import java.util.*;

//ABSTRACTION:- hiding all the unnecessary details and showing only the importnant part to the user.
//can be done by using 1.Abstract classes  2. Interfaces
//encapsulation is diiferent it is data hiding but Abstraction is to jst hide unnecessary but to show important data to the user.
//give idea
//not implementation

//ABSTRACT CLASS
//syntax:  abstract class A{}
// - Cannot create an instance of abstract class i.e. no object
// - can have bith abstract/ non-abstract methods (there is abstract funtion also)
//Syntax of abstractt funct: abstract void fun(); we dont define it s implemetation oof functn
// - can have constructor

public class Abstraction {

    public static void main(String[] args) {
        Horse h =new Horse();
        h.eat();
        h.walk();

        chicken c = new chicken();
        c.eat();
        c.walk();

        //Animal a = new Animal(); -- will give ERROR
    }
}
abstract class Animal{
    String color;
    Animal(){
        color ="brwon"; // its work is if we dont call cahane color functn then by default color will be brown.
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk(); // so this ANIMAL is just giving an idea of walk but not implementation
}
class Horse extends Animal{
    void changecolor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("Walks on 4ṇ leg");
    }
}
class chicken extends Animal{
    void changecolor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
