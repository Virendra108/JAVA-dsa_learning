import java.util.Arrays;

public class Kadan_subsum{
    public static int kadan(int[] nums) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<nums.length; i++){
            cs=cs+nums[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms,cs);
        }
        //to avoid the case where all the elements are negative
        if(ms==0){
            ms=nums[0];
            for(int i=1; i<nums.length; i++){
                ms=Math.max(ms,nums[i]);
            }
        }   
        return ms;
    }
    public static void main(String[] args) {
        //int[] a = {1, 2,-33, 4,4,4,5};
        int[] a = {0,-1,-4,-5};
        System.out.println(kadan(a));

    }
}

