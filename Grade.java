import java.util.*;
class Grade
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Overall Score: ");
		int score = sc.nextInt();
		char grade;
		if (score>90)
			grade = 'O';
		else if(score>80)
			grade = 'A';
		else if(score>70)
			grade = 'B';
		else if(score>60)
			grade = 'C';
		else
			grade = 'D';
		System.out.println("Your grade is "+grade);
	}
}