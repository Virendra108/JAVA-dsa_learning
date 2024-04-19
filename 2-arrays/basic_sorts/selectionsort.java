import java.util.*;

public class selectionsort{
    public static int[] selection(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            //swap
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;

        }
        return nums;
    }
    public static void main(String[] args) {
        int[] a = {4,2,0,6,3,2,5,-1,-33, 4,4,4,5};
        int[] sorted=selection(a);
        System.out.println(Arrays.toString(sorted));

    }
}

