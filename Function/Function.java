import java.util.*;

public class Function {

  // public static boolean isPrime(int n) {
  // if (n == 2) {
  // return true;
  // }

  // for (int i = 2; i <= n - 1; i++) {
  // if (n % i == 0) {
  // return false;
  // }
  // }
  // return true;
  // }

  public static boolean isPrime(int n) {
    if (n == 2) {
      return true;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }

  public static void primesInRange(int n) {
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  public static int avgThree(int a, int b, int c) {
    return (a + b + c) / 3;
  }

  public static boolean isEven(int a) {
    if (a % 2 == 0) {
      return true;
    }

    return false;
  }

  public static boolean isPalindrom(int n) {
    int palindrome = n;
    int reverse = 0;

    while (palindrome != 0) {
      int remainder = palindrome % 10;
      reverse = reverse * 10 + remainder;
      palindrome /= 10;
    }
    if (reverse == n) {
      return true;
    }

    return false;
  }

  public static int sumDigit(int n) {
    int adDigit = 0;
    while (n > 0) {
      int lastDigit = n % 10;
      adDigit += lastDigit;
      n /= 10;
    }

    return adDigit;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(isPalindrom(n));
    sc.close();
  }
}