public class Func {
  public static void main(String[] args) {

    // PrintStar(5, 5); 

    int a = 3; 
    int b = 5; 
    int c = 2; 
    double d = 5.0;  

    System.out.println("a + b = "+Sum(a, b)); 
    System.out.println("a + b + c = "+Sum(a, b, c)); 
    System.out.println("a + c = "+Sum(a, d)); 

  }

  // 函数的四部分 修饰符 函数名 参数列表 函数体
  public static void PrintStar(int N, int M) {
    for (int i = 0; i < N; ++i) {
      for (int j = 0; j < M; ++j) {
        System.out.print("*"); 
      }
      System.out.println(); 
    }
  }

  public static long Sum(int a, int b) {
    return a+b; 
  }

  // 函数重载 函数的参数列表不同 
  public static long Sum(int a, int b, int c) {
    return a+b+c; 
  }

  // 函数重载 函数返回值的类型不同 
  public static double Sum(double a, double b) {
    return a+b; 
  }

}
