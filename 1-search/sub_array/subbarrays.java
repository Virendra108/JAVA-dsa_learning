public class subbarrays {
    
    public static void subarray(int numbers[]) {
        int count=0;
        //int sum=0;                           //at this position it adds next arrays sum in previous array
        for(int i=0;i<numbers.length;i++){
            //int start=i;
            for(int j=i;j<numbers.length;j++){
                //int end=j;
                int sum=0;                     //at this loctaion for each array sum start from ZERO
                count++;                       // right location to get total subarrays
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+",");
                    sum=sum+numbers[k];       //added each element in that sum for each array
                    //count++;            // this gives total members int thE ARRAY
                }
            System.out.println("                     the sum of element in subarray is= "+sum);//after completion of each array printed the sum
            }
        System.out.println();
        }
        System.out.println("total="+count);
        
        
    }
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        subarray(numbers);
    }
}
