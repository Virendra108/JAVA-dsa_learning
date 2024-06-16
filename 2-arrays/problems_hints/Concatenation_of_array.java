/*Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1] */

//in given soolution time complexity is not O(2n) it is O(n)   reason is
//n Big-O notation, constant factors are ignored to focus on the growth rate relative to the input size. Therefore, O(2n) is simplified to O(n).

class Concatenation_of_array {
    public int[] getConcatenation(int[] nums) {
        int len=2*(nums.length);
        int[] getConcatenation=new int[len];
        int k=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<nums.length;j++){
                getConcatenation[k]=nums[j];
                k++;
            }
        }
        return getConcatenation;
    }
}
