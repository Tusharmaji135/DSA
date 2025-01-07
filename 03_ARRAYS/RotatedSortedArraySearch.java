public class RotatedSortedArraySearch {
  public static int search(int[] nums, int target) {
      int low = 0, high = nums.length - 1;

      while (low <= high) {
          int mid = (low + high) / 2;

          // Check if the middle element is the target
          if (nums[mid] == target) {
              return mid;
          }

          // Determine which half is sorted
          if (nums[low] <= nums[mid]) {
              // Left half is sorted
              if (target >= nums[low] && target < nums[mid]) {
                  high = mid - 1; // Search in the left half
              } else {
                  low = mid + 1; // Search in the right half
              }
          } else {
              // Right half is sorted
              if (target > nums[mid] && target <= nums[high]) {
                  low = mid + 1; // Search in the right half
              } else {
                  high = mid - 1; // Search in the left half
              }
          }
      }

      // Target not found
      return -1;
  }

  public static void main(String[] args) {
      int[] nums = { 6, 7, 0, 1, 2,4, 5};
      int target = 0;

      int result = search(nums, target);
      System.out.println("Index of target: " + result); // Output: 4
  }
}
