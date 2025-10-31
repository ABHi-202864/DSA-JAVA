
public class PolymorphismFuncOverriding {
  public static void main(String[] args) {
    Animal myAnimal = new Animal(); // Reference type: Animal
    Animal myDog = new Dog(); // Polymorphism in action
    Animal myCat = new Cat(); // Same here

    myAnimal.makeSound(); // Output: Some generic animal sound
    myDog.makeSound(); // Output: Woof! Woof!
    myCat.makeSound(); // Output: Meow! Meow!
  }
}

// Parent class
class Animal {
  void makeSound() {
    System.out.println("Some generic animal sound");
  }
}

// Child class 1
class Dog extends Animal {
  // Override
  void makeSound() {
    System.out.println("Woof! Woof!");
  }
}

// Child class 2
class Cat extends Animal {
  // Override
  void makeSound() {
    System.out.println("Meow! Meow!");
  }
}

// 🧠 What’s Happening?
// The same method name (makeSound) behaves differently depending on the object
// type.
// This is runtime polymorphism (dynamic method dispatch).
// The JVM decides at runtime which method to call — based on the actual object
// (not the reference type).