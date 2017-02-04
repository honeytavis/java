/**
 * @version 1.0 2017-02-04
 * @author Tavis
 */

class SingletonTest {
  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance(); 
    s1.show(); 
    System.out.println("s1 = "+s1); 

    Singleton s2 = Singleton.getInstance(); 
    s2.show(); 
    System.out.println("s2 = "+s2); 
  }
}
