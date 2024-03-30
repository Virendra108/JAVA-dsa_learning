/*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
Example 2:

Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
Example 3:

Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2] */
public class shuffle_nby2 {
    public int[] shuffle(int[] nums, int n) {
        int shuffled[]=new int [2*n]; //we always have to intialize the array to miniize errors
        for(int i=0;i<n;i++){
            shuffled[2*i]=nums[i];
            shuffled[2*i+1]=nums[n+i];
        }
        return shuffled;
    }
}

// Time Complexity: O(n)

//why 2*i and 2*i+1?  not i and i+1?
//The reason we use 2*i and 2*i+1 is because we need to place the elements at the even indices first and then the elements at the odd indices.

//elaborated answer:
/*In this loop, you're iterating i from 0 to n-1. However, inside the loop, when you're assigning values to the shuffled array, you're incrementing i by 1 after each iteration. This leads to incorrect indexing.

Let's consider what happens when i = 0:

shuffled[0] gets assigned nums[0], which is correct.
shuffled[1] gets assigned nums[n + 0], which is also correct, corresponding to nums[n].
Now, when i = 1:

shuffled[1] will get overwritten with nums[1], which is incorrect because it should be placed in shuffled[2].
shuffled[2] will get assigned nums[n + 1], which is correct. */
