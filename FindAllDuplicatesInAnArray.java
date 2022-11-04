/* https://leetcode.com/problems/find-all-duplicates-in-an-array/ */

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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

        List<Integer> arr = new ArrayList<>();
        int ans = 0;
        for (int j = 0;  j < nums.length; j++)
            if ( nums[j] != j+1)
                arr.add(nums[j]);

        return arr;
    }
}
