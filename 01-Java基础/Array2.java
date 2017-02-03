/**
 * @version 1.0 2017-02-01
 * @author Tavis
 */

class Array2 {
  public static void main(String[] args) {
    int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8}}; 
    System.out.println(arr1);   // [[I@15db9742
    System.out.println(arr1[0]); // [I@6d06d69c 
    System.out.println(arr1[1]); // [I@7852e922
    System.out.println(arr1[2]); // [I@4e25154f
    
    print(arr1); 
    reverse(arr1); 
    print(arr1); 
  }

  public static void reverse(int[][] arr) {
    for (int start = 0, int end = arr.length-1; start < end; ++start, --end) {
      int[] tmp = arr[start];
      arr[start] = arr[end];
      arr[end] = tmp;
    }
  }

  public static void print(int[][] arr) {
    for (int i = 0; i < arr.length; ++i) {
      for (int j = 0; j < arr[i].length; ++j) {
        System.out.print(arr[i][j]); 
      }
      System.out.println(); 
    }
  }

}
