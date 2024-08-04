import java.util.*;
public class Class_object {

    public static void main(String[] args) {
        pen p1=new pen(); // THIS IS OBJECT whos name is P1
        p1.setColor("Red");
        p1.setTip(4);
        System.out.println(p1); // will prinnt adreess of object stored
        System.out.println(p1.color); // willl prinnt the color of pen p1
        System.out.println(p1.tip); //print poin tip of p1

        //we can also do it directly  ny
        p1.color="Yellow";
        System.out.println(p1.color);
    }
}
class pen{                // THIS IS CLASS blueprint of the object
    String color;
    int tip;
    void setColor(String newcolor){
        color = newcolor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
