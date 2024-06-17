import java.util.Scanner;

public class string_func{
    public static void main(String args[]){
        String name="Virendra";

        //to find length of the sring entered
        int len=name.length();
        System.out.println(len);


        //to print CHARACTER present in string at specifeid index location
        //this function will treat string as an array of characters

        System.out.println(name.charAt(0));
        System.out.println("character present at 4th location: "+name.charAt(4));

        //this char at function and len can be used in various problems on string with the help of for loop

        for(int i=0;i<len;i++){    //second parametre in for loop i is like >,<,>=,<=   but i=len-1 or i=len was giving error
            System.out.println(name.charAt(i));
        }
        System.out.println(name.substring(0, 4));  //this will print the substring from 0 to 4th index

    }
}
