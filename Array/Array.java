package Array;
import java.util.*;

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

    // ---- BIG NB SEARCH
    int[] n = { 1, 2, 6, 3, 5 };
    System.out.println("Leargst Number : " + largestInArray(n));

  }
}
