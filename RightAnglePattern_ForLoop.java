import java.util.*;
class RightAnglePattern_ForLoop
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number for Right Angle Pattern: ");
		int num = sc.nextInt();
		int i = 1;
		for (;i<=num;i++)
		{
			for (int j = 1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}