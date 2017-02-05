/**
 * @version 1.0 2017-02-04
 * @author Tavis
 */

// 所有的类都默认继承 Object
class Father extends Object {
  Father() {
    System.out.println("Father()"); 
  }

  Father(int x) {
    System.out.println("Father(): "+x); 
  }

  public void show() {
    System.out.println("It is Father"); 
  }
}

class Child extends Father {
  Child() {
    // 子类构造函数的第一行都有一个隐式的 super(); 来调用父类的构造函数
    super(); 
    System.out.println("Child()"); 
  }

  Child(int x) {
    super(x); // 默认为super(); 
    System.out.println("Child(): "+x); 
  }

  // 子类方法覆盖父类方法 要求: 
  // 子类权限 >= 父类权限
  // 且方法一模一样
  public void show() { 
    // super.show(); 
    System.out.println("It is Child"); 
  }
}

class CoverTest {
  public static void main(String[] args) {
    // Child c = new Child(); 
    // c.show(); 
    Child c = new Child(5); 
  }
}
