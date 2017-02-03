/**
 * @version 1.0 2017-02-03
 * @author Tavis
 */

class PersonTest {
  public static void main(String[] args) {
  Person p = new Person("tavis", 20);   
  p.show(); 
  System.out.println(p); 

  Person p1 = new Person();
  p1.show(); 
  System.out.println(p1); 

  Person p3 = new Person("tavis", -20);   
  p3.show(); 
  System.out.println(p3); 

  }
}
