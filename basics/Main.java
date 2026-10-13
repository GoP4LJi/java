import java.util.Scanner;

class Employee {
    String name;
    double salary;
    String department;

    // 1. Default constructor
    Employee() {
        name = "Not provided";
        salary = 0.0;
        department = "Not assigned";
    }

    // 2. Constructor with name
    Employee(String name) {
        this.name = name;
        this.salary = 0.0;
        this.department = "Not assigned";
    }

    // 3. Constructor with name and salary
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.department = "Not assigned";
    }

    // 4. Constructor with name, salary and department
    Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Display employee information
    void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary +
                ", Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] parts = input.split("/");

        Employee employee;

        if (parts.length == 1) {
            employee = new Employee(parts[0]);
        } 
        else if (parts.length == 2) {
            double salary = Double.parseDouble(parts[1]);
            employee = new Employee(parts[0], salary);
        } 
        else {
            double salary = Double.parseDouble(parts[1]);
            employee = new Employee(parts[0], salary, parts[2]);
        }

        employee.displayInfo();

        sc.close();
    }
}