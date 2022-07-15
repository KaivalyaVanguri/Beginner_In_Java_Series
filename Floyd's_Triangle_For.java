import java.util.*;
class Floyd's_Triangle_For
{
	public static void main()
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++)
		{
			for(int j = i; j <= num; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}