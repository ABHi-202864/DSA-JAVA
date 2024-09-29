package array; // Declare PACKAGE

import java.util.*;
// import function.Function; // importing class from other packages 

public class Array {

  // LINEAR SEARCH
  public static int linearSearch(int[] number, int key) {
    for (int i = 0; i < number.length; i++) {
      if (number[i] == key) {
        return i;
      }
    }

    return -1;
  }

  // FOOD SEARCH BY LINEAR-SEARCH
  public static int foodSearch(String[] food, String userNeed) {
    for (int i = 0; i < food.length; i++) {
      if (food[i].equals(userNeed)) {
        return i;
      }
    }

    return -1;
  }

  // LEARGEST IN ARRAY
  public static int largestInArray(int[] n) {
    int largest = Integer.MIN_VALUE;
    // int smallest = Integer.MAX_VALUE;

    for (int i = 0; i < n.length; i++) {
      if (n[i] > largest) {
        largest = n[i];
      }
    }

    return largest;
  }

  // BINARY SEARCH
  public static int binarySearch(int[] number, int key) {
    int start = 0, end = number.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;
      if (number[mid] == key) {
        return mid;
      }

      if (number[mid] < key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return -1;
  }

  // REVERSE IN ARRAY
  public static void reverse(int[] numbers) {
    int first = 0, last = numbers.length - 1;

    while (first < last) {
      int temp = numbers[first];
      numbers[first] = numbers[last];
      numbers[last] = temp;

      first++;
      last--;
    }
  }

  // PAIRS IN ARRAY
  public static void printPairs(int[] arr) {
    int tp = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        System.out.print("(" + arr[i] + "," + arr[j] + ") ");
        tp++;
      }
      System.out.println();
    }

    System.out.println("tp = " + tp);
  }

  // SUBARRAY
  public static void printSubarray(int[] arr) {
    int ts = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        for (int k = i; k <= j; k++) {
          System.out.print(arr[k] + " ");
        }
        ts++;
        System.out.println();
      }
      System.out.println();
    }

    System.out.println("ts : " + ts);
  }

  // MAX SUBARRAY SUM -- (brute force)
  public static int maxSubarraySum(int[] arr) {
    int MS = Integer.MIN_VALUE;
    int CS = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        CS = 0;
        for (int k = i; k <= j; k++) {
          CS += arr[k];
        }
        System.out.print(CS + " ");
        if (MS < CS) {
          MS = CS;
        }
      }
      System.out.println();
    }
    System.out.println("MAX SUN = " + MS);

    return MS;
  }

  public static void main(String[] args) {
    // ---- NUMBER SEARCH
    // int[] number = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
    // System.out.println(linearSearch(number, 10));

    // ---- STRING SEARCH
    // String[] food = { "Salad", "Sandwich", "Bread", "Steak", "Tuna Steak",
    // "Fish", "Shrimp", "Rice" };
    // Scanner sc = new Scanner(System.in);
    // String userNeed = sc.nextLine();
    // System.out.println(foodSearch(food, userNeed));

    // ---- LARGEST IN ARRAY
    // int[] n = { 1, 2, 6, 3, 5 };
    // System.out.println("Leargst Number : " + largestInArray(n));

    // ---- BINARY SEARCH
    // int[] number = { 2, 4, 6, 8, 10, 12, 14, 16 };
    // System.out.println(binarySearch(number, 10));
    // }

    // // ---- REVERSE IN ARRAY
    // int[] numbers = { 2, 4, 6, 8, 10 };
    // reverse(numbers);
    // for (int i = 0; i < numbers.length; i++) {
    // System.out.print(numbers[i] + " ");
    // }

    // ----- PAIRS IN ARRAY
    // int[] arr = { 2, 4, 6, 8, 10 };
    // printPairs(arr);

    // ----- PRINT SUBARRAY
    // int[] arr = { 2, 4, 6, 8, 10 };
    // printSubarray(arr);

    // MAX SUBARRAY SUM -- (brute force)
    // int[] arr = { 1, -2, 6, -1, 3 };
    // maxSubarraySum(arr);

  }
}