import Polymorphism.Animal;

public class Abstraction {
  public static void main(String[] args) {
    // Horse h = new Horse();
    // h.walk();

    // System.out.println(h.color);

    Mustang myHorse = new Mustang();
    
  }
}

abstract class Animal {
  String color;

  // Animal() {
  // color = "Black";
  // }

  Animal() {
    System.out.println("Animal Constructor Called!");
  }

  void eat() {
    System.out.println("can eat");
  }

  abstract void walk();
}

class Horse extends Animal {
  Horse() {
    System.out.println("Horse Constructor Called!");
  }

  void changeColor() {
    color = "white";
  }

  void walk() {
    System.out.println("can wolk fast");
  }
}

class Mustang extends Horse {
  Mustang() {
    System.out.println("Mustang Constructor Called!");
  }
}

class Chicken extends Animal {

  void changeColor() {
    color = "brown";
  }

  void walk() {
    System.out.println("can walk slow");
  }
}