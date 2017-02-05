/**
 * @version 1.0 2017-02-04
 * @author Tavis
 */

/**
 * 继承
 *   提高了代码的复用性
 *   为多态提供了条件
 */ 

class Person {
  // private String name; // 父类的私有属性 子类无法直接访问
  String name;
  String ID; 
  int age; 
}

class Student extends Person {
  String ID; 

  Student(String name, String ID, int age, String SID) {
    this.name = name; 
    super.ID = ID; // super代表父类的空间
    this.age = age; 
    this.ID = SID; 
  }

  public void study() {
    System.out.println("name: "+name); 
    System.out.println("ID: "+super.ID); 
    System.out.println("age: "+age); 
    System.out.println("SID: "+ID); 
  }
}

class Worker extends Person {
  private int salary; 

  Worker(String name, String ID, int age, int salary) {
    this.name = name; 
    this.ID = ID; 
    this.age = age; 
    this.salary = salary; 
  }

  public void work() {
    System.out.println("name: "+name); 
    System.out.println("ID: "+ID); 
    System.out.println("age: "+age); 
    System.out.println("salary: "+salary); 
  }
}

class ExtendsTest {
  public static void main(String[] args) {
    Student s1 = new Student("mengwei", "14052201", 20, "201201"); 
    s1.study();
    Worker w1 = new Worker("dady", "14052202", 40, 3000); 
    w1.work(); 
  }
}
