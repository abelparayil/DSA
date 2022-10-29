/* https://leetcode.com/problems/search-insert-position/description/ */

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 13, 56, 75};
        int target = 6;
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
            while(start <= end){
                int mid = start + ((end - start) / 2);
                if(target < arr[mid]){
                    end = mid - 1;
                } else if (target > arr[mid]){
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        return arr[end];
    }
}
