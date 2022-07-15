import java.util.Scanner;
//import java.lang.Math;
class Palindrome_While
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean b = false;
		int old_n = n;
		int new_n = 0;
		int i = 0;
		while(n>0)
		{
			new_n += (int)((n%10)*Math.pow(10,i));
			n = (int)(n/10);
			i ++;
		}
		if (old_n == new_n)
			b = true;
		System.out.println("It's a palindrome : "+b);
	}
}