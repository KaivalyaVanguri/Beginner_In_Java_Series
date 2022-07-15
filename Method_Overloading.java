import java.util.Scanner;
class Method_Overloading
{
	public static int meth1(int a, int b)
	{
		return a+b;
	}
	public static double meth1(double a, int b)
	{
		return a+b;
	}
	public static String meth1(String a, String b)
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 2 integers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int r1 = meth1(num1,num2);
		System.out.println("Please enter a double and an integer");
		double num3 = sc.nextDouble();
		int num4 = sc.nextInt();
		double r2 = meth1(num3,num4);
		System.out.println("Please enter 2 strings");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String r3 = meth1(num3,num4);
		System.out.println(r1+" "+r2+" "+r3);
	}
}