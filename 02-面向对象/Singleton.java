/**
 * @version 1.0 2017-02-04
 * @author Tavis
 */

/**
 * 单例设计模式: 保证一个类的对象在内存中的唯一性
 * 实现思路: 
 *   1 不允许其他程序通过new来创建对象
 *   2 在本类中自己new一个本类的对象
 *   3 对外提供程序获取该对象的方式
 * 步骤: 
 *   1 将类的构造函数私有化
 *   2 在本类中new一个对象
 *   3 定义一个方法返回该对象
 */ 

class Singleton {
  private String name = "lenovo"; 
  private int price = 100; 

  private Singleton() { } // 将类的构造函数私有化

  // 非延迟加载方式
  private static final Singleton SINGLE_INSTANCE  = new Singleton(); // 在本类中new一个对象
  
  public static Singleton getInstance() { // 返回该对象
    return SINGLE_INSTANCE; 
  }

  // 延迟加载方式
  // private static Singleton s = null;  

  // public static Singleton getInstance() { // 返回该对象
  //   if (s == null) { 
  //     s = new Singleton(); 
  //   }
  //   return s; 
  // }

  public void show() {
    System.out.println("name: "+name+", price: "+price);
  }

}
