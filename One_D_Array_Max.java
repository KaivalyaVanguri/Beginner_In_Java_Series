import java.util.Scanner;
class One_D_Array_Max
{	
	//public static int j; This is a correct syntax 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
	   	int j = 0; //gives a class error if you try using access specifier inside a method.
		System.out.println("Give Input for elements: ");
		//for (int i: a) 
		//Above one It works for showing the max element of the list but indexing doesnt work out well 
		//and will always return a 0
		for (int i= 0; i<a.length; i++)
		{
			a[i] = 	sc.nextInt();
			if (a[i] > max)
			{
				max = a[i];
				j = i;
			}
			
		}
		System.out.println("Maximum element"+max+" index is "+j);		
		
	}
}