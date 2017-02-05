/**
 * @version 1.0 2017-02-05
 * @author Tavis
 */

// 1. 抽象类中有构造函数么？
//    有 抽象类的构造函数虽然不能给抽象类对象实例化 因为抽象类不能创建对象
//    但是抽象类有子类 它的构造函数可以给子类的对象实例化
//
// 2. 抽象类一定是个父类吗？
//    是的 需要子类覆盖这些方法后 才可以实例化 使用这些方法
//
// 3. 抽象类中可以不定义抽象方法吗？
//    可以  
//
// 4. abstract 不能和哪些关键字共存？
//    final private static 

abstract class Employee {
  private String name; 
  private String id; 
  private double salary; 
  
  Employee(String name, String id, double salary) {
    this.name = name; 
    this.id = id; 
    this.salary = salary; 
  }

  public String getName() {
    return this.name; 
  }

  public String getId() {
    return this.id; 
  }

  public double getSalary() {
    return this.salary; 
  }

  public abstract void work(); 
}

class Programmer extends Employee {
  Programmer(String name, String id, double salary) {
    super(name, id, salary); 
  }

  public void work() {
    System.out.println("name: "+getName()+", id: "+getId()+", salary: "+getSalary()); 
  }
}

class Manager extends Employee {
  private double bonus; 
  Manager(String name, String id, double salary, double bonus) {
    super(name, id, salary); 
    this.bonus = bonus; 
  }

  public void work() {
    System.out.println("name: "+getName()+", id: "+getId()+", salary: "+getSalary()+", bonus: "+getBonus()); 
  }

  public double getBonus() {
    return bonus; 
  }
}

public class AbstructTest {
  public static void main(String[] args) {
    Programmer p = new Programmer("tavis", "01201701", 3000); 
    p.work(); 
    Manager m = new Manager("tengwei", "01201201", 8000, 1000); 
    m.work(); 
  }
}
