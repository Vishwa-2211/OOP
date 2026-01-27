import java.util.Scanner;
class Employee
{
	String employeeName;
	double employeeSalary;

	void readEmployeeData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("250393107014");
		System.out.print("Enter employee name: ");
		employeeName = sc.nextLine();
		System.out.print("Enter employee salary: ");
		employeeSalary = sc.nextDouble();
	}

	void displayEmployeeData() 
	{
		
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Salary: " + employeeSalary);
	}

public static void main(String[] args) 
	{
		Employee emp = new Employee();

		emp.readEmployeeData();
		emp.displayEmployeeData();
	}
}