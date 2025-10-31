public class Inheritance {
  public static void main(String[] args) {

  }
}

// Base-Parent class
class Animal {
  String color;

  void eat() {
    System.out.println("can eat");
  }

  void breathe() {
    System.out.println("can breath");
  }
}

// Derived-Chield class
class Mammal extends Animal {
  int legs;

  void walk() {
    System.out.println("can walk");
  }
}

class Fish extends Animal {
  void swim() {
    System.out.println("can swim");
  }
}

class Bird extends Animal {
  void fly() {
    System.out.println("can fly");
  }
}

// Multipal Level Inheritance
class Dog extends Mammal {
  String bride;
}