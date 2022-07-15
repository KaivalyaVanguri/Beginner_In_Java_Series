import java.util.*;//Importing Scanner Class
class Java_Lab_Internal{
	public static void main(String[] args){
		System.out.println("Length Of the Array of Double Values:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter percentages:");
		double darr[] = new double[n];
		for(int i = 0; i<n; i++)
			darr[i] = sc.nextDouble();
		double avg = 0.0;
		for(double j : darr)//Enhanced For Loop
			avg += j;
		avg /= n;
		char grade;
		if (avg>=90.0)
			grade = 'A';
		else if (avg>=80.0)
			grade = 'B';
		else if (avg>=70.0)
			grade = 'C';
		else if (avg>=60.0)
			grade = 'D';
		else if (avg>=50.0)
			grade = 'E';
		else 
			grade = 'F';
		System.out.println("Your grade is="+grade);
			
	}
}