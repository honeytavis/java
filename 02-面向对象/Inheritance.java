/**
 * @version 1.0 2017-02-04
 * @author Tavis
 */

class Person {
  private String name;
  private String ID;
  private int age;

  Person(String name, String ID, int age) {
    this.name = name; 
    this.ID = ID; 
    this.age = age;
  }

  public void show() {
    System.out.println("name: "+name+", ID: "+ID+", age: "+age); 
  }

}

// Student 将不会有子类
final class Student extends Person {
  public static final double MATH_PI = 3.14; // 全局常量
  private String SID;

  Student(String name, String ID, int age, String SID) {
    super(name, ID, age); 
    this.SID = SID;
  }
  
  // show() 将不会被继承
  final public void show() {
    super.show(); 
    System.out.println("SID: "+SID); 
  }

}

class Worker extends Person {
  private int salary; 

  Worker(String name, String ID, int age, int salary) {
    super(name, ID, age); 
    this.salary = salary; 
  }

  public void show() {
    super.show(); 
    System.out.println("salary: "+salary); 
  }
}

class Inheritance {
  public static void main(String[] args) {
    Student s1 = new Student("mengwei", "14052201", 20, "201201"); 
    s1.show(); 
    Worker w1 = new Worker("dady", "14052202", 40, 3000); 
    w1.show(); 
  }
}
