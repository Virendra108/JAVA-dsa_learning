import java.util.*;

public class GetSetThis {
    Pen p1=new Pen();
    p1.setcolor("Blue");
}
class Pen{
    private String color;
    private int tip;
    String getcolor(){
        return this.color;
    }
    void setcolor(String color){
        this.color=color;
    }

}
