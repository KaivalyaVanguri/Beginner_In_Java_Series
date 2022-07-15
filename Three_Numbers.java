import java.util.Scanner;
class Three_Numbers
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		System.out.println("Enter a number");
		int y = sc.nextInt();
		System.out.println("Enter a number");
		int z = sc.nextInt();
		int high = 0,low = 0,avg = 0;
		if (x>=y && y>=z)
		{
			high = x;
			avg = y;
			low = z;
		}
		else if (x>=y && x>=z && z>=y)
		{
			high = x;
			avg = z;
			low = y;
		}
		else if (y>=x && x>=z)
		{
			high = y;
			avg = x;
			low = z;
		}
		else if (y>=x && y>=z && z>=x)
		{
			high = y;
			avg = z;
			low = x;
		}
		else if (z>=y && y>=x)
		{
			high = z;
			avg = y;
			low = x;
		}
		else if (z>=y && z>=x && x>=y)
		{
			high = z;
			avg = x;
			low = y;
		}
		System.out.println("HIGH: "+high+" AVG: "+avg+" LOW: "+low);
	}
}