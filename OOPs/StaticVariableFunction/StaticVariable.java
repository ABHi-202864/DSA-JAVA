package StaticVariable;
public class StaticVariable {
  public static void main(String[] args) {
    Employee e1 = new Employee("Abhi");
    Employee e2 = new Employee("Raj");

    System.out.println(e1.companyName); // TechCorp
    System.out.println(e2.companyName); // TechCorp

    Employee.companyName = "NextGen AI Labs";

    System.out.println(e1.companyName); // NextGen AI Labs
    System.out.println(e2.companyName); // NextGen AI Labs
  }
}

class Employee {
  static String companyName = "TechCorp"; // static variable
  String name; // instance variable

  Employee(String name) {
    this.name = name;
  }
}

// ✅ Notice: When we changed companyName using the class name,
// the change was reflected for all objects — because there’s only one shared
// copy.