import java.util.Scanner;
class Shape
{
	double length;
	double breadth;
	String shape_name;
	double area;
	Shape(double l, double b, String s)
	{
		length = l;
		breadth = b;
		shape_name = s;
	}
	void area_quad()
	{
		area = length*breadth;
		display();
	}
	void area_tri()
	{
		area = length*breadth/2;
		display();
	}
	void judge_shape()
	{
		switch(shape_name)
		{
			case "quadrilateral":
			case "square":
			case "rectangle":
				area_quad();
				break;
			case "triangle":
				area_tri();
				break;
			default:
				System.out.println("ERROR");
		}
	}
	
	void display()
	{
		System.out.println("Area of the Shape "+area);
	}
}
class ObjectCreationShape
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		String n = sc.next();
		Shape poly = new Shape(l,b,n);
		poly.judge_shape();
	}
}