/* https://leetcode.com/problems/set-mismatch/ */

class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] <= nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else
                i++;
        }

        int ans = 0;
        for (int j = 0;  j < nums.length; j++)
            if ( nums[j] != j+1)
                return new int[] {nums[j], j+1 };

        return new int[] {-1, -1};
    }
}
