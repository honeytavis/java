/**
 * @version 1.0 2017-02-03
 * @author Tavis
 */

class Person {
  private String name; 
  private int age; 
  // 静态数据成员可以直接用类名调用
  // 静态数据成员优先于对象存在
  // 静态成员随着类的加载而加载 随着来的消失而消失
  // 静态数据成员一般为类的共同属性
  // static private String country = "CN"; 
  static String country = "CN"; 

  // 构造函数 
  // 构造函数可以私有化 只在本类中使用
  // 构造函数一旦私有化 其他程序就无法创建该类的对象
  Person() {
    name ="李四"; 
    age = 0; 
  }

  private Person(String n) {
    // this("李四", 30); // Error 递归调用构造函数
    name = n; 
  }

  // 一旦自定义了构造函数 默认构造函数就没有了
  Person(String n, int a) {
    this(n); // 访问其它构造函数
    if (a < 0) {
      return ; 
    } else {
      age = a; 
    }
    // this(n); // Error 用于调用构造函数的this语句必须定义在构造函数的第一行
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

  // sleep没有使用对象中的数据 则不需要创建对象
  // 类的静态方法可以通过类名直接访问
  // 静态方法中不能出现 this 或 super 关键字
  // 主函数是静态的
  static public void sleep() {
    System.out.println("哈哈"+country); 
    // System.out.println("哈哈"+name); 
    // Error 静态方法只能访问静态数据成员
  }

}
