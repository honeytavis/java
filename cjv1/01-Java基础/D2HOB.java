/**
 * @version 1.0 2017-01-31
 * @author Tavis
 */

import java.lang.*; 

public class D2HOB {
  public static void main(String[] args) {
    int x = -1; 
    System.out.println(x+" = "+toHex(x));
    System.out.println(x+" = "+toOctal(x));
    System.out.println(x+" = "+toBinary(x));

    System.out.println(x+" = "+Integer.toHexString(x));
    System.out.println(x+" = "+Integer.toOctalString(x));
    System.out.println(x+" = "+Integer.toBinaryString(x));
  }
  
  private static String toHex(int N) {
    return "0x"+trans(N, 15, 4); 
  }

  private static String toOctal(int N) {
    return "0"+trans(N, 7, 3); 
  }

  private static String toBinary(int N) {
    return trans(N, 1, 1); 
  }

  private static String trans(int N, final int BASE, final int OFFSET) {
    char[] Base = new char[]{'0', '1', '2', '3', 
                             '4', '5', '6', '7', 
                             '8', '9', 'A', 'B', 
                             'C', 'D', 'E', 'F'}; 
    char[] Result = new char[32]; 

    int index = Result.length; 
    while (N != 0) { // 正负数均可以
      int tmp = N & BASE; 
      N = N >>> OFFSET; 
      Result[--index] = Base[tmp]; 
    }

    String S = ""; 
    while (index < Result.length) {
      S += Result[index++]; 
    }
    return S; 
  }
}
