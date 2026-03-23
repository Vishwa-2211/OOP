import java.util.Scanner;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String projectName;

    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    @Override
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}

public class Practical24{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	System.out.println("250393107014");
        System.out.println("Enter Employee Name:");
        String empName = sc.nextLine();

        System.out.println("Enter Employee Department:");
        String empDept = sc.nextLine();

        Employee emp = new Employee(empName, empDept);

        System.out.println("\nEnter Manager Name:");
        String mgrName = sc.nextLine();

        System.out.println("Enter Manager Department:");
        String mgrDept = sc.nextLine();

        System.out.println("Enter Team Size:");
        int teamSize = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Project Name:");
        String projectName = sc.nextLine();

        Employee mgr = new Manager(mgrName, mgrDept, teamSize, projectName);

        System.out.println("\n---- Employee Details ----");
        emp.displayDetails();

        System.out.println("\n---- Manager Details ----");
        mgr.displayDetails();

        sc.close();
    }
}