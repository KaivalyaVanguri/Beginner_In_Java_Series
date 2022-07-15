import java.util.*;
class MaxNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int a = sc.nextInt();
		System.out.print("Enter Number 2: ");
		int b = sc.nextInt();
		System.out.print("Enter Number 3: ");
		int c = sc.nextInt();
		if (a>=b){
			if (a>c){
				System.out.println(a+" is the greatest of all");
				}
			else{
				System.out.println(c+" is the greatest of all");
			}
		}
		else if (a<b){
			if (b>=c){
				System.out.println(b+" is the greatest of all");
			}
			else{
				System.out.println(c+" is the greatest of all");
			}
		}
	}
}