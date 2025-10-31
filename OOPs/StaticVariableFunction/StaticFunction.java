
public class StaticFunction {
  // ⚙️ Syntax Example ---->
  // public static void main(String[] args) {
  // int result = MathUtils.square(5); // no object needed
  // System.out.println(result); // 25
  // }

  // ⚙️ Example with Both ---->
  public static void main(String[] args) {
    new Counter();
    new Counter();
    Counter.displayCount(); // ✅ Accessing static method using class name
  }
}

// ⚙️ Syntax Example ---->
// class MathUtils {
// static int square(int n) {
// return n * n;
// }
// }

// ⚙️ Example with Both ---->
class Counter {
  static int count = 0;

  Counter() {
    count++;
  }

  static void displayCount() {
    System.out.println("Total objects created: " + count);
  }
}

// 🚫 Key Restriction
// Static methods cannot access non-static (instance) variables or methods
// directly,
// because they don’t have a specific object to work with.
// Example (❌ won’t work):

// class Demo {
// int x = 10;

// static void print() {
// // System.out.println(x); ❌ Error: non-static variable x cannot be referenced
// from a static context
// }
// }
