import java.util.*;
//RUN TIME POLYMMORPHISM
//Parent and child classes both contain the same function with a different definition parametere or count may same.
//--> definition is different <--
public class MethodOverriding {
    public static void main(String[] args) {
        Deer d= new Deer();
        d.eat();// so it will call child function child is preffered over parent if we accces form child.
        Animal a = new Animal();
        a.eat();// priority is based from whom we are accesing is prefered over it.
    }
}
class Animal{
    void eat(){
        System.out.println("Eat Anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass only");
    }
}
