import java.util.Scanner;
class Number_Pattern_4
{
	public static void main(String[] args)
	{
		for (int i = 0; i<9; i+=3)
		{
			for (int j=i+3; j>i; j--)
			{
				System.out.print(j);
			}
   			System.out.println();
		}
	}
}