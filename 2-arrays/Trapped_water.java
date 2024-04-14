import java.util.*;

public class Trapped_water{
    public static int rain(int[] nums) {
        int lmax[]=new int[nums.length];
        lmax[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            lmax[i]=Math.max(lmax[i-1],nums[i]);
        }
        int rmax[]=new int[nums.length];
        rmax[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            rmax[i]=Math.max(rmax[i+1],nums[i]);
        }
        int water=0;
        for(int i=0;i<nums.length;i++){
            int level=Math.min(lmax[i],rmax[i]);
            water+=level-nums[i];
        }
        return water;

    }
    public static void main(String[] args) {
        int[] a = {4,2,0,6,3,2,5};
        System.out.println(rain(a));

    }
}

