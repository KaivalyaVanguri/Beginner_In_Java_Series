import java.util.*;
class Student
{
	long roll_no;
	int age = 18;
	String name;
	float score1;
	float score2;
	float score3;
	void input_id_marks(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Id : ");
		long num = sc.nextLong();
		roll_no = num;
		System.out.print("Enter Subject 1 Score : ");
		float f = sc.nextFloat();
		score1 = f;
		System.out.print("Enter Subject 2 Score : ");
		f = sc.nextFloat();
		score2 = f;
		System.out.print("Enter Subject 3 Score : ");
		f = sc.nextFloat();
		score3 = f;
		System.out.print("Enter Student Name : ");
		name = sc.next();
	}
	double calculate_average(){
		double avg = (score1+score2+score3)/3;
		return avg;
	}
	void display(){
		System.out.println("STUDENT ID: "+roll_no);
		System.out.println("STUDENT subject 1 score "+score1);
		System.out.println("STUDENT subject 2 score "+score2);
		System.out.println("STUDENT subject 3 score "+score3);
	}
}
class Student_Demo
{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.input_id_marks();
		s1.display();
		int a = s1.calculate_average();
		switch(a)
		{
			case 10: grade = 'A';
				 break;
			case 9:
			case 8: grade = 'B';
				break;
			case 7: 
			case 6: grade = 'C';
				break;
			case 5:
			case 4: grade = 'D';
				break;
			case 3:
			case 2:
			case 1: grade = 'F';
				break;
		}
		System.out.println("Your Overall Score is: "+s1.calculate_average());
	}
}