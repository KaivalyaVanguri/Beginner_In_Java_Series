import java.util.*;//import java.util.Scanner;
class ReadInputviaScanner
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Your name is "+name);
	}
}