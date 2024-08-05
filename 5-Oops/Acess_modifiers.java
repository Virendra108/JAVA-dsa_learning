import java.util.*;
public class Acess_modifiers {

    public static void main(String[] args) {
        
        BankAcc acnt = new BankAcc();
        acnt.name = "Virendra";
        acnt.Password="123dsa";   //GIVE ERROR AS PASS IS DECLARED PRIVATE
        acnt.setpass("123dsa");   //this will set password as it can be accesed in same class
    }
}
class BankAcc{
    public String name;
    private String Password;
    public void setpass(String psw){
        Password = psw;             // can be accesed in same class
    }
}
