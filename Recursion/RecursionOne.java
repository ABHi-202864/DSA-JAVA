public class RecursionOne {

  public static void printDec(int n) {
    if (n == 1) {
      System.out.println(n);
      return;
    }

    System.out.print(n + " ");

    printDec(n - 1);
  }

  public static void printInc(int n) {
    if (n == 1) {
      System.out.print(n + " ");
      return;
    }

    printInc(n - 1);
    System.out.print(n + " ");
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }

    int fn = n * factorial(n - 1);

    return fn;
  }

  public static void main(String args[]) {
    int n = 5;

    System.out.println(factorial(n));
  }
}

// No 6 videos -- start learn