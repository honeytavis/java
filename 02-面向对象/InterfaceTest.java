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

class InterfaceTest {
  public static void main(String[] args) {
    Worker w = new Worker(); 
    w.work(); 
    w.rest(); 
  }
}
