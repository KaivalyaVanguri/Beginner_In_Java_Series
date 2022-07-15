import java.util.Scanner;
class Execution
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dim of rectangle");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		Rectangle r1 = new Rectangle();
		r1.set_dimension(l,b);
		System.out.println(r1.getArea());
		System.out.println("Enter dim of square");
		double s = sc.nextDouble();
		Square s1 = new Square();
		s1.set_dimension(s, s);
		System.out.println(s1.getArea());
	}
}
interface Area{
	void set_dimension(double a, double b);
	double getArea();
}//abstract methods are set here which are overriden later
class Rectangle implements Area{
	double l, b;
	public void set_dimension(double length, double breadth){
		l = length;
		b = breadth;
	}
	public double getArea(){
		return l*b;
	}
}
class Square implements Area{
	double side1, side2;
	public void set_dimension(double side_length, double s){
		side1 = side_length;
		side2 = s;
	}
	public double getArea(){
		return side1*side2;
	}
}