package Polymorphism;

import java.lang.reflect.Method;

public class PolymorphismFuncOverloading {
  public static void main(String[] args) {

    class Calculator {
      int add(int a, int b) {
        return a + b;
      }

      double add(double a, double b) {
        return a + b;
      }
    }
  }
}
// ⚡ Bonus: Compile-Time Polymorphism (Method Overloading)
// Here, multiple methods have the same name but different parameter lists —
// that’s compile-time polymorphism.
