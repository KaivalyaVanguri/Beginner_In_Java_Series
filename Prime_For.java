import java.util.Scanner;
class Prime_For
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean b =  true;
		for(int i=2; i<n;i++)
		{
			if (n%i == 0)
				{
				b = false;
				System.out.println("NO");
				break;
				}
		}
		if (b==true)
			System.out.println("YES");
	}
}