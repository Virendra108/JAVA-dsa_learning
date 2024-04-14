import java.util.*;

public class Buy_Sell_stock{
    public static int stock(int[] nums) {
        int bp=Integer.MAX_VALUE;
        int maxprofit=0;    //if no profit then it will return 0

        for(int i=0;i<nums.length;i++){
            if(bp<nums[i]){
                int profit = nums[i]-bp;
                maxprofit = Math.max(maxprofit,profit);
            }
            else{
                bp=nums[i];
            }
        }
        return maxprofit;

    }
    public static void main(String[] args) {
        int[] a = {1, 2,6, 4,4,4,5};
        //int[] a = {0,-1,-4,-5};
        System.out.println(stock(a));

    }
}
