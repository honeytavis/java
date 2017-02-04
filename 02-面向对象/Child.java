/**
 * @version 1.0 2017-02-04
 * @author Tavis
 */

/**
 * 对象创建的流程: 
 * 加载指定的字节码文件进内存
 * 通过new在堆内存中开辟空间 分配首地址值
 * 对对象中的属性进行默认初始化
 * 调用与之对应的构造函数 构造函数压栈
 * 执行3件事
 * 构造函数执行
 * 对象初始化完成 返回对象的地址给指定的引用
 */ 

class Child {
  private int age = 100; 
  private String name = "lenovo"; 

  // 所有构造函数执行之前要做3件事: 
  // 调用父类的构造函数 super(); 
  // 显示初始化
  // 构造代码块初始化
  Child() {
    System.out.println("Child()"); 
    System.out.println("age: "+age+", name: "+name); 
  }
  
  Child(int age) {
    this.age = age; 
    System.out.println("Child(int)"); 
    System.out.println("age: "+age+", name: "+name); 
  }

  Child(int age, String name) {
    this.age = age; 
    this.name = name; 
    System.out.println("Child(int, String)");
    System.out.println("age: "+age+", name: "+name); 
  }

  // 构造代码块 大括号不可省略
  // 先于构造函数执行
  { 
    System.out.println("age: "+age+", name: "+name); 
  }

}
