import java.util.Scanner;
class Temp_Fah_Cel
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in Fahrenheit to Convert to Celsius :");
		double fah = sc.nextDouble();
		double cel = (fah - 32)*5/9; 
		System.out.println("Given Fahrenheit: "+fah+" Celsius : "+cel);	
	}
}