import java.util.*;
class WeekDays
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Today day number: ");
		int day_num = sc.nextInt();
		String day = "Day";
		switch(day_num){
			case 1:
				day = "Monday";
				break;
			case 2:
				day = "Tuesday";
				break;
			case 3:
				day = "Wednesday";
				break;
			case 4:
				day = "Thursday";
				break;
			case 5:
				day = "Friday";
				break;
			case 6:
				day = "Saturday";
				break;
			case 7:
				day = "Sunday";
				break;
			default:
				System.out.println("Wrong Day Number");
		}
		if(day!="Day")
			System.out.println("Today is "+day);
	}
}