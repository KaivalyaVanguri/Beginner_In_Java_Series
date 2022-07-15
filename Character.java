import java.util.*;
class Character
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Letter: ");
		char c = sc.next().charAt(0);
		String vowels = "aeiou";
		String t = "";
		int r = ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))?1:0;
		switch(r){
			case(0):
				t = "special character";
				break;
			case(1):
				t = "vowel";
				switch(vowels.indexOf(c)){
					case(-1):
						t = "consonant";
				}
		}
		System.out.println("Your character "+c+" is "+t);
	}
}