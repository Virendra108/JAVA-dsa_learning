import java.util.*;
public class subarraysum {
    public static void subsum(int num[]){
        for (int i=0;i<num.length;i++){
            int start=i;
            for (int j=i;j<num.length;j++){
                int end=j;
                int count=0;
                int sum=0;
                for (int k=start;k<=end;k++){
                    sum+=num[k];
                    count++;
                    System.out.print(num[k]+" ");
                }
                System.out.println("sum of subarray is "+sum);
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        subsum(num);
    }
}