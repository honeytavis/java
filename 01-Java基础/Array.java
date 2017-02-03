/**
 * @version 1.0 2017-02-01
 * @author Tavis
 */

class Array {
  public static void main(String[] args) {
    int[] arr1 = new int[4];  
    System.out.println(arr1);      // [I@15db9742

    int[][] arr2 = new int[3][2]; 
    System.out.println(arr2);     // [[I@6d06d69c
    System.out.println(arr2[0]);   // [I@7852e922 
    System.out.println(arr2[0][0]); 

    int[][] arr3 = new int[3][];
    System.out.println(arr3);     // [[I@4e25154f
    System.out.println(arr3[0]);  // null
    // System.out.println(arr3[0][0]); 

    arr3[0] = new int[3]; 
    arr3[1] = new int[1]; 
    arr3[2] = new int[2]; 
    System.out.println(arr3[0]);  // [I@70dea4e
    System.out.println(arr3[1]);  // [I@5c647e05
    System.out.println(arr3[2]);  // [I@33909752

    System.out.println(arr3.length); 
    System.out.println(arr3[0].length); 
  }

}
