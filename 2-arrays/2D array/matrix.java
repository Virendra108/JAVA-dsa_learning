import java.util.Scanner;

public class matrix{
    public static void creat(int nmatrix[][]){
        int n=nmatrix.length,m=nmatrix[0].length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cell values of matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                nmatrix[i][j]=sc.nextInt();
            }
        }
    }
    public static void out(int nmatrix[][]){
        int n=nmatrix.length,m=nmatrix[0].length;
        System.out.println("The matrix will  look like this: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(nmatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        int nmatrix[] []= new int[5][3];
        creat(nmatrix);
        out(nmatrix);
    
    }
}
