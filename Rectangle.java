import java.util.Scanner;
class Poly_Rectangle 
{
	double length,breadth;
	double perimeter()
	{
		return 2*(length+breadth);
	}
	double area(double l, double b)
	{
		return l*b;
	}
	void display()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Length Of the Rectangle ");
		length = sc.nextDouble();
		System.out.print("Breadth Of the Rectangle ");
		breadth = sc.nextDouble();
		System.out.println("Specs Of the Rectangle");
		System.out.println("Perimeter Of the Rectangle: "+perimeter());
		System.out.println("Area Of the Rectangle: "+area(length,breadth));	
	}
}
class Rectangle
{
	public static void main(String[] args)
	{
		Poly_Rectangle p_r_1 = new Poly_Rectangle();
		p_r_1.display(); 
	}

}