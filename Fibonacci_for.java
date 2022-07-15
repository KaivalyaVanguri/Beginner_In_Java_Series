import java.util.Scanner;
class Fibonacci_for
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 1;
		int i = 2;
		if (n>=2)
			System.out.print(a+" "+b);
		else
			System.out.println(a);
		while(i<n){
			c = a+b;
			System.out.print(" "+c);
			a = b;
			b = c;
			i++;
		}
	}
}