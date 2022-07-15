import java.util.*;
class Star_Pattern
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n; i>0; i--)
		{	
			int k = n-i;
			while(k>0)
			{
				System.out.print(' ');
				k--;
			}
			for (int j = i; j>0; j--)
			{	
				System.out.print('*');
			}	
				System.out.println();
			
		}
	}
}