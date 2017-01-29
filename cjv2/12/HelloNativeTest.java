/**
 * @version 1.11 2017-01-29
 * @author Tavis
 */ 

class HelloNativeTest {
  public static void main(String[] args) {
    HelloNative.greeting(); 
  }
    
  static {
    System.loadLibrary("HelloNative"); 
  }
}
