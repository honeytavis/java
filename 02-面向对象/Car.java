/**
 * @version 1.0 2017-02-03
 * @author Tavis
 */

/**
 * 封装 将类的属性全部私有化 对外提供setXXX getXXX方法
 */ 

public class Car {
  int num; 
  String color; 

  public void run() {
    System.out.println("num : "+num); 
    System.out.println("color : "+color); 
  }

  public void setNum(int n) {
    if (num < 0 || num > 6) {
      throw RuntimeException(n+": 数值错误");
    } else {
      num = n; 
    }
  }
}
