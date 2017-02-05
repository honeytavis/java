/**
 * @version 1.0 2017-02-05
 * @author Tavis
 */

// 继承用于获取类的基本功能 
// 接口用于扩展类的功能
interface A {
  public abstract void run1();
}

interface B {
  public abstract void run1();
  public abstract void run2(); 
}

class Phone {
  public void show() {
    System.out.println("A.show()"); 
  }
}

// Java 将C++中的多继承改良为接口的多实现
class SmartPhone extends Phone implements A, B {
  public void run1() {
    System.out.println("run1()"); 
  }

  public void run2() {
    System.out.println("run2()"); 
  }
}

class MultiImplements {
  public static void main(String[] args) {
    SmartPhone sp = new SmartPhone(); 
    sp.run1(); 
    sp.run2(); 
    sp.show(); 
  }
}
