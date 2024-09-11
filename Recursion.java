class Recursion {

  public static void printDec(int n) {
    if (n == 1) {
      System.out.print(n + " ");
      return;
    }
    printDec(n - 1);
    System.out.print(n + " ");
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    int fn = n * factorial(n - 1);

    return fn;
  }

  public static int naturalNumber(int n) {
    if (n == 1) {
      return 1;
    }
    int fn = n + naturalNumber(n - 1);

    return fn;
  }

  public static int fibonacciN(int n) {
    if (n == 0 || n == 1) {
      return n;
    }

    return fibonacciN(n - 1) + fibonacciN(n - 2);
  }

  public static boolean isSorted(int[] n, int i) {
    if (n[i] == n.length - 1) {
      return true;
    }
    if (n[i] > n[i + 1]) {
      return false;
    }

    return isSorted(n, i + 1);
  }

  public static int firstOccurence(int[] n, int key, int i) {
    if (i == n.length - 1) {
      return -1;
    }
    if (n[i] == key) {
      return i;
    }

    return firstOccurence(n, key, i + 1);
  }

  public static int lastOccurence(int[] n, int key, int i) {
    if (i == n.length) {
      return -1;
    }
    int isFound = lastOccurence(n, key, i + 1);
    if (isFound == -1 && n[i] == key) {
      return i;
    }

    return isFound;
  }

  public static int power(int x, int n) {
    if (n == 0) {
      return 1;
    }

    return x * power(x, n - 1);
  }

  public static int optimizedPower(int a, int n) {
    if (n == 0) {
      return 1;
    }
    int halpPower = optimizedPower(a, n / 2);
    int halpPowerSq = halpPower * halpPower;

    // n is odd
    if (n % 2 != 0) {
      halpPowerSq = a * halpPowerSq;
    }
    return halpPowerSq;
  }

  public static int tilingProblem(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    // kam
    return tilingProblem(n - 1) + tilingProblem(n - 2);
  }

  public static void removeDuplicate(String str, int idx, StringBuilder sb, boolean[] map) {
    if (idx == str.length()) {
      System.out.println(sb);
      return;
    }

    char currChar = str.charAt(idx);
    if (map[currChar - 'a'] == true) {
      removeDuplicate(str, idx + 1, sb, map);
    } else {
      map[currChar - 'a'] = true;
      removeDuplicate(str, idx, sb.append(currChar), map);
    }
  }

  public static int friendsPairing(int n) {
    if (n == 1 || n == 2) {
      return n;
    }

    return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
  }

  public static void myTest(int n) {
    if (n == 1) {
      System.out.println("*");
      return;
    }

    myTest(n - 1);
    System.out.println("*");
  }

  public static void printBinaryString(int n, int lastPlace, String str) {
    // base case
    if (n == 0) {
      System.out.println(str);
      return;
    }

    printBinaryString(n - 1, 0, str + "0");
    if (lastPlace == 0) {
      printBinaryString(n - 1, 1, str + "1");
    }
  }

  public static void occurence(int[] arr, int key, int idx) {
    if (idx == arr.length) {
      return;
    }

    if (arr[idx] == key) {
      System.out.print(idx + " ");
    }

    occurence(arr, key, idx + 1);
  }

  static String[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

  public static void printgDigits(int number) {
    if (number == 0) {
      return;
    }

    int lastDigit = number % 10;
    printgDigits(number / 10);
    System.out.print(digits[lastDigit] + " ");
  }

  public static int length(String str) {
    if (str.length() == 0) {
      return 0;
    }

    return length(str.substring(1, str.length())) + 1;
  }

  public static int countSubstrs(String str, int i, int j, int n) {
    if (n == 1) {
      return 1;
    }
    if (n <= 0) {
      return 0;
    }
    int res = countSubstrs(str, i + 1, j, n - 1) + countSubstrs(str, i, j - 1, n - 1)
        - countSubstrs(str, i + 1, j - 1, n - 2);
    if (str.charAt(i) == str.charAt(j)) {
      res++;
    }

    return res;
  }

  public static void main(String[] args) {
    String str = "abcab";
    int n = str.length();
    System.out.print(countSubstrs(str, 0, n - 1, n));
  }
}