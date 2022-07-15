import java.util.Scanner;
class Number_Pattern_2
{
	public static void main(String[] args){
		int j;
		for (int i = 3; i>0; i--)
		{	
			j=i*3;
			System.out.print(j+" ");
			for (j=i*3-1; j%3>0; j--)
			{
			System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}