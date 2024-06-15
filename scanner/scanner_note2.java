//USING SINGLE SCANNER IN ,ULTIPLE CLASS/ METHODS IS GOOD PRACTICE IN CODING
//FOR THIS WE HAVE TO DECLARE IT IN MAIN FUNCTION TO AVOID FURTHER ERRORS 
import java.util.Scanner;

class UserInput {
    public void readName(Scanner sc) {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Name: " + name);
    }

    public void readAge(Scanner sc) {
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Single Scanner instance

        UserInput userInput = new UserInput();
        userInput.readName(sc);
        userInput.readAge(sc);

        sc.close(); // Close the Scanner when done
    }
}


//IF WE DONT DECALRE SCAanner in main  method then we have two declare it again gain in ever method/class


/*Declaring and initializing the Scanner instance inside the readName method itself will not cause an error.
  However, it is generally not considered good practice for a few reasons, especially when dealing with interactive console input using System.in.
  Let's explore these considerations with an example and explanation. */

//so  it will cause multpile scanner usage which is a BAD PRACTICE.
