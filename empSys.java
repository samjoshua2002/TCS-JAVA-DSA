import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

class emp {
  protected String id;
  protected String name;
  protected String role;
  protected double salary;
  protected double exp;

  public emp(String id, String name, String role, double salary, double exp) {
    this.id = id;
    this.name = name;
    this.role = role;
    this.salary = salary;
    this.exp = exp;
  }
}

public class empSys {
  static Scanner sc = new Scanner(System.in);
  static List<emp> list = new ArrayList<>();

  static void printEmp() {
    for (int i = 0; i < list.size(); i++) {
      emp e = list.get(i);
      System.out.println(
          (i + 1) + ". Id: " + e.id + ", Name: " + e.name + ", " + "Role: " + e.role + ", " + " Exp: " + e.exp);
    }
  }

  static emp addEmp() {
    System.out.println("Enter the name of the Employee: ");
    String name = sc.nextLine();
    System.out.println("Enter the role of the Employee: ");
    String role = sc.nextLine();
    System.out.println("Enter the salary of the Employee: ");
    double salary = sc.nextDouble();
    System.out.println("Enter the total years of exp: ");
    double exp = sc.nextDouble();
    sc.nextLine(); // Consume the leftover newline
    emp e = new emp(UUID.randomUUID().toString(), name, role, salary, exp);
    return e;
  }

  static void editEmp() {
    printEmp();
    System.out.print("Choose the Employee to edit: ");
    int choice = sc.nextInt();
    sc.nextLine(); // Consume the leftover newline
    emp e = list.get(choice - 1);

    System.out.println("Editing Employee: " + e.name);
    System.out.print("Enter new name (leave empty to keep current): ");
    String newName = sc.nextLine().trim();
    if (!newName.isEmpty()) {
      e.name = newName;
    }

    System.out.print("Enter new role (leave empty to keep current): ");
    String newRole = sc.nextLine().trim();
    if (!newRole.isEmpty()) {
      e.role = newRole;
    }

    System.out.print("Enter new salary (0 to keep current): ");
    double newSalary = sc.nextDouble();
    if (newSalary != 0) {
      e.salary = newSalary;
    }

    System.out.print("Enter new total years of experience (0 to keep current): ");
    double newExp = sc.nextDouble();
    if (newExp != 0) {
      e.exp = newExp;
    }
    sc.nextLine(); // Consume the leftover newline

    System.out.println("Employee details updated successfully.");
  }

  static void deleteEmp() {
    printEmp();
    System.out.print("Choose the Employee to delete: ");
    int choice = sc.nextInt();
    sc.nextLine(); // Consume the leftover newline
    list.remove(choice - 1);
  }

  public static void main(String[] args) {
    int choice = 0;
    while (true) {
      System.out.println("Menu: ");
      System.out.println("1. Enter a new Emp");
      System.out.println("2. Delete a Emp");
      System.out.println("3. Edit a Emp");
      System.out.println("4. Get a Emp");
      System.out.println("5. Exit");
      choice = sc.nextInt();
      sc.nextLine(); // Consume the leftover newline

      switch (choice) {
        case 1:
          list.add(addEmp());
          break;
        case 2:
          deleteEmp();
          break;
        case 3:
          editEmp();
          break;
        case 4:
          System.out.println("List of Employees: ");
          printEmp();
          break;
        case 5:
          System.out.println("Exiting the program.");
          sc.close();
          System.exit(0); // terminate the program
          break;
        default:
          System.out.println("Wrong choice");
          break;
      }
    }
  }
}
