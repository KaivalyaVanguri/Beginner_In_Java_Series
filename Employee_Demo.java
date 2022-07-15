import java.util.*;
class Employee
{
	long emp_id;
	String name;
	double salary;
	void display(){
		System.out.println("Employee ID: "+emp_id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+salary);
	}
}
class Employee_Demo
{
	public static void main(String[] args){
		Employee e1 = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id : ");
		long num = sc.nextLong();
		e1.emp_id = num;
		System.out.print("Enter Employee Name : ");
		String s = sc.next();
		e1.name = s;
		System.out.print("Enter Employee Salary : ");
		double d = sc.nextDouble();
		e1.salary = d;
		e1.display();
	}
}