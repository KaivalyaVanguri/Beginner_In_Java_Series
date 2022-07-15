import java.util.Scanner;
class Area_Of_Triangle
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		System.out.println("Area Of triangle: "+(((base*height)/2)));
	}
}