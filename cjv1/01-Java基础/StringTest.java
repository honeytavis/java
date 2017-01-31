/**
 * @version 1.0 2017-01-31
 * @author Tavis
 */

class StringTest {
  public static void main(String[] args) {
    int[] nums = new int[]{1, 2, 3, 4, 5, 7, 8, 9}; 
    System.out.println("nums: "+toString(nums)); 
    System.out.println(getWeek(8)); 
  }

  private static String toString(int[] nums) {
    // String S = new String(""); 
    // String S = new String(); 
    String S = ""; 
    for (int i = 0; i < nums.length; ++i) {
      S += nums[i]; 
    }
    return S; 
  }

  private static String getWeek(int num) {
    if (num > 7 || num < 1)
      throw new RuntimeException(num+": 非法输入"); 
    String[] weeks = {"星期日", "星期一","星期二","星期三","星期四","星期五","星期六"}; 
    return num+": "+weeks[num % 7]; 
  }
}
