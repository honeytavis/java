/**
 * @version 1.0 2017-02-03
 * @author Tavis
 */

class Person {
  private String name; 
  private int age; 
  // 构造函数 
  // 构造函数可以私有化 只在本类中使用
  // 构造函数一旦私有化 其他程序就无法创建该类的对象
  Person() {
    name ="李四"; 
    age = 0; 
  }

  private Person(String n) {
    name = n; 
  }

  // 一旦自定义了构造函数 默认构造函数就没有了
  Person(String n, int a) {
    this(n); 
    if (a < 0) {
      return ; 
    } else {
      age = a; 
    }
  }

  public void setName(String n) {
    name = n; 
  }

  public String getName() {
    return name; 
  }

  public void setAge(int a) {
    age = a; 
  }

  public int getAge() {
    return age; 
  }

  public void show() {
    System.out.println("name : "+name+", age: "+age); 
    // System.out.println(this); // 对象所在的地址
  }

}
