/* https://leetcode.com/problems/container-with-most-water/description/ */

class Solution {
    public int maxArea(int[] height) {
        int ans = 0, res , start = 0, end = height.length - 1;
        while (start < end){
            if (height[start] < height[end]){
                res = height[start] * (end - start);
                start++;
            } else {
                res = height[end] * (end - start);
                end--;
            }

            if (res > ans)
                ans = res;
        }
        return ans;
    }
}
