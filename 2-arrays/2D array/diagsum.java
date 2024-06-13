public class diagsum {
    //to calculate sum of both diagonal of matrix
    public static void sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];  //primary diagonal element
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        System.out.println("Sum of both diagonal is "+sum);
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        sum(matrix);
    }
    
}
