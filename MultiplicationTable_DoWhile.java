import java.util.*;
class MultiplicationTable_DoWhile
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to print Multiplication Table till 10: ");
		int num = sc.nextInt();
		int i = 1;
		do {
			System.out.println(num+" x "+i+" = "+num*i);
			i++;
		}while (i<=10);
		
	}
}