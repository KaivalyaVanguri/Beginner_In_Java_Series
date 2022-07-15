import java.util.Scanner;
class Prime_Do_While
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check whether its a prime or not : ");
		int num = sc.nextInt();
		int i = 2;
		String s;
		boolean b = true;
		do
		{
			if ((num%i == 0 & num != 2) || (num <= 1))
				b = false;
			i++;
		}
		while(i<=(int)(num/2)+1);
		if (b) s = " a ";
		else s = " not a ";
		System.out.println("Its"+s+"Prime Number.");
	}
}