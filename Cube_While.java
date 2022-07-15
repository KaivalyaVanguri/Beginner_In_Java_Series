import java.util.*;
class Cube_While
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to find Cubes upto that number from zero: ");
		int num = sc.nextInt();
		int i = 0;
		while (i<=num){
			System.out.println(i*i*i);
			i++;
		}
		
	}
}