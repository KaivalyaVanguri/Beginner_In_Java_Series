import java.util.Scanner;
class Number_Pattern_Two_For
{
	public static void main(String[] args)
	{
		int j = 1;
		for (int i = 1; i<=3; i++)
		{
			for(j = j; j<=i*3; j++){
			System.out.print(j+" ");	}
			System.out.println();
		}
	}
}