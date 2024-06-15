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
        Scanner sc2=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);   //if we use same sc variable in the second statement it was giving error not takin input for the second vairable.
        /*String name;
        String name1;*/
        name=sc2.next();     //will take onlly one word as input after space it is closed
        System.out.println(name);
        System.out.println("now for second a full line:");
        name1=sc1.nextLine();
        System.out.println(name1);   //take whole line includong space in the sentence also will not stop taking input untill eter is pressed


        //declaring two scanners in one programm is BAD PRACTICE.

        //here in this program we required a sc1.nextline(); to consume the remaining line this will remove that error


        //IMP

        //CORRECTED PROGRAM WITH SINGLE SCANNER USED


        Scanner sc = new Scanner(System.in);  // Single Scanner instance

        System.out.print("Enter your first name: ");
        String firstName = sc.next();  // Read the first name (single word)
        sc.nextLine();  // Consume the remaining newline

        System.out.print("Enter your last name: ");
        String lastName = sc.next();  // Read the last name (single word)
        sc.nextLine();  // Consume the remaining newline

        System.out.print("Enter your age: ");
        int age = sc.nextInt();  // Read the age (integer)
        sc.nextLine();  // Consume the remaining newline

        System.out.print("Enter your address: ");
        String address = sc.nextLine();  // Read the entire address (full line)

        System.out.print("Enter your favorite quote: ");
        String quote = sc.nextLine();  // Read the favorite quote (full line)

        System.out.println("\nUser Information:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Favorite Quote: " + quote);

        sc.close();  // Close the Scanner when done
//closing the scanner after completion is also consdered as a good practice in coding.
      //in small program  we can close it at end but in big programm it shoould be closed when it need is over.
    }
}
