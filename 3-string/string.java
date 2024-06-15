import java.util.Scanner;

public class string {

    public static void main(String[] args){
        String str1="first";
        String str2=new String("second_with seperated forced memory allocation");
        System.out.println(str1);
        System.out.println(str2);
        
        //String are immutable

        //taking string values as input from user
        String name;
        String name1;
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);   //if we use same sc variable in the second statement it was giving error not takin input for the second vairable.
        /*String name;
        String name1;*/
        name=sc.next();     //will take onlly one word as input after space it is closed
        System.out.println(name);
        System.out.println("now for second a full line:");
        name1=sc1.nextLine();
        System.out.println(name1);   //take whole line includong space in the sentence also will not stop taking input untill enter is pressed
        sc.close();
        sc1.close();

    }
}
