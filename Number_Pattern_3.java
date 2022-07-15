import java.util.Scanner;
class Number_Pattern_3
{
	public static void main(String[] args)
	{
		for (int i = 3; i>0; i--)
		{
			for (int j = i; j<10-(3-i); j+=3)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}