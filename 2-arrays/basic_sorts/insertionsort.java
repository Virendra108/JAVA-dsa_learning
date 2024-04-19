import java.util.*;

public class insertionsort{
    public static int[] insertion(int[] nums) {
        for(int i=1; i<nums.length; i++){
            int curr=nums[i];
            int prev=i-1;
            while(prev>=0 && nums[prev]>curr){
                nums[prev+1]=nums[prev];
                prev--;
            }
            //insertion
            nums[prev+1]=curr;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] a = {4,2,0,6,3,2,5,-1,-33, 4,4,4,5};
        int[] sorted=insertion(a);
        System.out.println(Arrays.toString(sorted));

    }
}

