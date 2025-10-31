
class StaticVariable2 {
  public static void main(String[] args) {
    new Counter(); // 1
    new Counter(); // 2
    new Counter(); // 3
  }
}

class Counter {
  static int count = 0;
  
  Counter() {
    count++;
    System.out.println("Objects created: " + count);
  }
}