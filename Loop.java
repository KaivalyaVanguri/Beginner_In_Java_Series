import java.util.*;
class Loop
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		int i = 1;
		while(i<=n)
		{
			System.out.println("Inside while Loop "+i);
			i++;
		}
		i = 0;
		while(i<=n)
		{
			i++;
			System.out.println("Inside while Loop "+i);
		}
		i = 1;
		do
		{
			System.out.println("inside do while "+i);
			i++;
		}while(i<=n);
		for(int j = 10; j>0; j--)
		{
			if (j%3 == 0)
				continue;
			System.out.println("inside for loop "+j);
		}
	}
}