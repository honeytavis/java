/**
 * @version 1.0 2017-02-03
 * @author Tavis
 */

class StaticCode {
  // static {
  //   System.out.println("Hello");
  // }

  static void show() {
    System.out.println("StaticCode"); 
  }
  
  // 不管静态代码放在何处 都会先执行
  static {
    System.out.println("Hello");
  }
}
