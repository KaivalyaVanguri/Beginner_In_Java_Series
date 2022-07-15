import java.util.*;
class Student
{
	long roll_no;
	float score1;
	float score2;
	float score3;
	float score4;
	float score5;
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
		System.out.print("Enter Subject 4 Score : ");
		f = sc.nextFloat();
		score4 = f;
		System.out.print("Enter Subject 5 Score : ");
		f = sc.nextFloat();
		score5 = f;
	}
	double calculate_average(){
		double avg = (score1+score2+score3+score4+score5)/5;
		return avg;
	}
	void display(){
		System.out.println("STUDENT ID: "+roll_no);
		System.out.println("STUDENT subject 1 score "+score1);
		System.out.println("STUDENT subject 2 score "+score2);
		System.out.println("STUDENT subject 3 score "+score3);
		System.out.println("STUDENT subject 4 score "+score4);
		System.out.println("STUDENT subject 5 score "+score5);
	}
}
class Student_Demo
{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.input_id_marks();
		s1.display();
		System.out.println("Your Overall Score is: "+s1.calculate_average());
	}
}