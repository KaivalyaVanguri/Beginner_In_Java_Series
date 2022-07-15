import java.util.Scanner;
class Grade_Switch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float score1, score2, score3, score4, score5;
		System.out.println("Enter Numerical Values of Your Scores");
		System.out.print("Enter Subject 1 Score: ");
		score1 = sc.nextFloat();
		System.out.print("Enter Subject 2 Score: ");
		score2 = sc.nextFloat();
		System.out.print("Enter Subject 3 Score: ");
		score3 = sc.nextFloat();
		System.out.print("Enter Subject 4 Score: ");
		score4 = sc.nextFloat();
		System.out.print("Enter Subject 5 Score: ");
		score5 = sc.nextFloat();
		char grade;
		int avg = (int)(Math.round(score1+score2+score3+score4+score5/5)/10);
		switch(avg)
		{
			case 10:
			case 9: grade = 'O'; break;
			case 8:
			case 7:grade = 'A'; break;
			case 6:grade = 'B'; break;
			case 5:grade = 'C'; break;
			case 4:grade = 'D'; break;
			case 3:
			case 2:
			case 1:grade = 'F'; break;
			default:grade = 'X';
		}
		System.out.println("Grade Scored "+grade);
		System.out.println("***If scored X then recheck your input");
	}
}