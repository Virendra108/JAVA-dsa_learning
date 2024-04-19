import java.util.*;

public class bubblesort{
    public static int[] bubble(int[] nums) {
        for(int turn=0; turn<nums.length-1; turn++){
            for(int i=0; i<nums.length-1-turn; i++){
                if(nums[i]>nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] a = {4,2,0,6,3,2,5};
        //int[] a = {0,-1,-4,-5};
        //System.out.println(bubble(a));
        int[] sorted=bubble(a);
        System.out.println(Arrays.toString(sorted));

    }
}

