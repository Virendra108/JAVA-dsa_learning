import java.util.*;
//Multiple function with the same name but different parametres
//we can have different 'input type','input count'
//not from return type it doesent affect function overloading
public class MethodOverloading {

    public static void main(String[] args) {
        Calculator calci = new Calculator();
        System.out.println(calci.sum(10, 10));
        System.out.println(calci.sum((float)3.5,(float) 4.3));
        System.out.println(calci.sum(10, 10, 10));
    }
}
class Calculator{
    int sum(int a,int b){
        return a + b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    /*void sum(int a ,int b){
        System.out.println(a+b);
    }*/   //just chaging the return type will give error as duplicatre function
    // so function overloading doesent make sense in the form of return type change


    //now why it is COMPILE TIME ?
    // compiler was already knowin it at time of compilation that he have to call 1 st function for that inpit, 
    // 2nd for float inputs and 3rd for 3 inputs
    // so it is compile time polymorphism
}
