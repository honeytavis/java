/**
 * @version 1.0 2017-02-05
 * @author Tavis
 */

/**
 * 接口中的成员和类中的成员相比:
 * 接口中常见的成员有两种: 1.全局常量 2.抽象方法 
 * 它们都有固定的修饰符
 */ 

/**
 * 接口的特点
 * 1.接口不可以实例化
 * 2.接口中所有的抽象方法都被覆盖后 才能被实例化
 * 3.接口是用来实现的
 */ 

interface Employee {
  public static final double PI = 3.14; 

  public abstract void work(); 
  public abstract void rest(); 
}

class Worker implements Employee {
  public void work() {
    System.out.println("Hello World!"); 
  }

  public void rest() {
    System.out.println("Goodbye!");
  }
}

interface I1 {
  void show1(); 
}

interface I2 {
  void show2(); 
}

// 接口之间可以多继承
interface I3 extends I1, I2 {
  void show3(); 
}

// class Demo implements I3 {
//   public void show1() {}
//   public void show2() {}
//   // Demo需要使用接口中的部分方法
//   public void show3() {
//     System.out.println("Demo"); 
//   }
// }

// 抽象类方便创建接口的对象
abstract class Demo implements I3 {
  public void show1() {}
  public void show2() {}
  public void show3() {}
}

class Demo1 extends Demo {
  public void show3() {
    System.out.println("Demo1.show3()"); 
  }
}

class InterfaceTest {
  public static void main(String[] args) {
    Worker w = new Worker(); 
    w.work(); 
    w.rest(); 
  }
}
