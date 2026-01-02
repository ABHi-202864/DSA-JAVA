import java.util.*;

public class PQOne {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter real and imaginary part of first complex number:");
    double r1 = sc.nextDouble();
    double i1 = sc.nextDouble();

    System.out.println("Enter real and imaginary part of second complex number:");
    double r2 = sc.nextDouble();
    double i2 = sc.nextDouble();

    Complex c1 = new Complex(r1, i1);
    Complex c2 = new Complex(r2, i2);

    Complex sum = c1.add(c2);
    Complex diff = c1.subtract(c2);
    Complex prod = c1.multiply(c2);

    System.out.println("\nSum:");
    sum.display();

    System.out.println("Difference:");
    diff.display();

    System.out.println("Product:");
    prod.display();

    sc.close();
  }
}

class Complex {
  double real;
  double imag;

  // Constructor
  Complex(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  // Method to add two complex numbers
  Complex add(Complex other) {
    return new Complex(this.real + other.real, this.imag + other.imag);
  }

  // Method to subtract two complex numbers
  Complex subtract(Complex other) {
    return new Complex(this.real - other.real, this.imag - other.imag);
  }

  // Method to multiply two complex numbers
  Complex multiply(Complex other) {
    double realPart = (this.real * other.real) - (this.imag * other.imag);
    double imagPart = (this.real * other.imag) + (this.imag * other.real);
    return new Complex(realPart, imagPart);
  }

  // Display method
  void display() {
    if (imag >= 0)
      System.out.println(real + " + " + imag + "i");
    else
      System.out.println(real + " - " + (-imag) + "i");
  }
}