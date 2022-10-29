/* https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/ */

public class NumbersWithEvenNumberOfDigits{
  
  public static void main(String[] args) {
    int[] arr = {1, 22, 333, 4444, 55555};
    System.out.println(findNumbers(arr));
  }
  
  public int findNumbers(int[] nums) {
       int count = 0;
       for (int i=0; i<nums.length; i++){
           int number = nums[i];
           int digits = (int)(Math.log10(number)) + 1;
           if(digits % 2 == 0)
               count++;
       }
       return count;
   }
  
}
