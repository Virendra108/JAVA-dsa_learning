import java.util.*;

public class GetSetThis {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setcolor("Blue");
        System.out.println(p1.getcolor());
    }
}
class Pen{
    private String color;
    private int tip;
    String getcolor(){             //get function we use to fetch the data from class which is private or of toher acess modifier
        return this.color;
    }
    void setcolor(String color){   // samw way we cant modify rivate so we use set int that same class.
        this.color=color;         // At here 'this' is important because there are two same named variables but when we used this.color-> refers to color of the class while the color int that function refers to parametre color.
    }

}
