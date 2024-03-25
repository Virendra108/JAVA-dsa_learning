import java.util.Scanner;

public class sum {
    public static void calcsum(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
    Scanner sc1= new Scanner(System.in);
    int a= sc1.nextInt();
    int b= sc1.nextInt();
    calcsum(a, b);   
    sc1.close(); 
    }
}