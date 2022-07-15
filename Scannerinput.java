import java.util.*;
class Scannerinput
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Reg. No.: ");
		long reg = sc.nextLong();
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		System.out.print("Enter Score : ");
		float score = sc.nextFloat();
		System.out.println("Your name is "+name);
		System.out.println("Your registration no. is "+reg);
		System.out.println("Your age is "+age);
		System.out.println("Your score is "+score);
	}
}