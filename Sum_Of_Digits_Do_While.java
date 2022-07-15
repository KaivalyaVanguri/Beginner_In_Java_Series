import java.util.*;
class Sum_Of_Digits_Do_While
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		do{
			count += n%10;
			n = (int)(n/10);
		}while(n>0);
		System.out.println("Sum of Digits = "+count);
	}
}