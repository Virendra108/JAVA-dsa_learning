import java.util.Arrays;

public class Kadan_subsum2{
    public static int kadan(int[] nums) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int start = 0;
        int end = 0;
        int temp = 0;
        for(int i=0; i<nums.length; i++){
            cs=cs+nums[i];
            if(cs<0){
                cs=0;
                temp = i+1; //update the temp index
            }
            //ms=Math.max(ms,cs);
            //we cant use the above line because we need to store the start and end index of the subarray
            if(cs>ms){
                ms=cs;
                start = temp; //update the start index
                end = i; //update the end index
            }
        }
        //to avoid the case where all the elements are negative
        if(ms==0){
            ms=nums[0];
            for(int i=1; i<nums.length; i++){
                //ms=Math.max(ms,nums[i]);
                if(ms<nums[i]){
                    ms=nums[i];
                    start = i;
                    end = i;
                }
            }
        }
        for(int i=start; i<=end; i++){
            System.out.print(nums[i]+" ");
        }
        return ms;
        //return new int[]{ms, start, end};
    }
    public static void main(String[] args) {
        int[] a = {1, 2,-33, 4,4,4,5};
        //int[] a = {0,-1,-4,-5};
        System.out.println(kadan(a));

    }
}

