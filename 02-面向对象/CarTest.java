/**
 * @version 1.0 2017-02-03
 * @author Tavis
 */

public class CarTest {
  public static void main(String[] args) {
    // Car c1 = new Car(); 
    // Car c2 = new Car(); 
    // 
    // c1.num = 4; 
    // c1.color = "red"; 
    // c1.run(); 
    // System.out.println("c1 = "+c1); // c1 = Car@15db9742
    
    // 匿名对象可以作为实际对象进行传递
    // 如果对象对方法只进行一次调用 可以简化为匿名对象的形式
    
    // new Car().num = 4; // 匿名对象
    // new Car().color = "red"; 
    // new Car().run();

    Car c3 = new Car(); 
    c3.setNum(8); 
  }
}
