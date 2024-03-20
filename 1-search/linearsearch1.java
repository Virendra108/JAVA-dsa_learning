import java.util.Scanner;

public class linearsearch1 {
    public static void search(int arr[],int key) {
        boolean res=false;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==key) {
                res=true;
                System.out.println("the value is found at "+i);
                break;
            }
        }
        if(res==false){
            System.out.println("no such element in the array");//if we took this inside for loop it have printed this statement n times.
        }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);                  //always take just one scanner and use it everywehre you want.
        System.out.print("enter max size of array: ");
        int n=sc.nextInt();                                   //try declare arrays and variables out of loop to icrease its scope.
        int[] number=new int[n];                             //this is the way to declare an array with user entred limit.
                                                             //datatype[] name= new datatype[parametre];
        System.out.println("enter the array element: ");
        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }
        System.out.println("\nEnter the key you want to search: ");
        int key=sc.nextInt();
        sc.close();                                         //at last close the scanner.
        search(number,key);                                 // in function call dont write any paramatere not even square bracke only and onle name is written

    }
}
