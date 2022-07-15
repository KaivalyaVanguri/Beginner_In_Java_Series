import java.util.Scanner;
class Employee_Class
{
	long Emp_ID;
	String E_Name;
	int Sal;
	void insert(long ID, String name, int inc)
	{
		Emp_ID = ID;
		E_Name = name;
		Sal = inc;
	}
	void show()
	{
		System.out.println(Emp_ID+" "+E_Name+" "+Sal);
	}
}
class ObjectCreationEmployee
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Employee_Class e1 = new Employee_Class();
		System.out.println("ID, Name, Income");
		long id = sc.nextLong();
		String n = sc.next();
		int in = sc.nextInt();
		e1.insert(id,n,in);
		e1.show();
	}
}