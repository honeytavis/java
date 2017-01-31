/**
 * @version 1.0 2017-01-31
 * @author Tavis
 */

class Sort {
  public static void main(String[] args) {
    int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    print(nums); 
    selectSort(nums); 
    print(nums); 
  }
  
  private static void print(int[] nums) {
    for (int i = 0; i < nums.length; ++i) {
      System.out.print(nums[i]); 
    }
    System.out.println(); 
  }

  private static void selectSort(int[] nums) {
    for (int i = 0; i < nums.length-1; ++i) {
      int min = i; 
      for (int j = i+1; j < nums.length; ++j) {
        if (nums[min] > nums[j])
          min = j; 
      }
      if (min != i) {
        swap(nums, min, i); 
      }
    }
  }

  private static void swap(int[] arr, int x, int y) {
    int tmp = arr[x]; 
    arr[x] = arr[y]; 
    arr[y] = tmp; 
  }
}
