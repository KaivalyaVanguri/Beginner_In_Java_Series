import java.util.Scanner;
class Pre_Post
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 1;
		int res = a++ + ++b + b-- + --a + b++ + a--;
		System.out.println(a+" "+b+" "+res);
	}
}