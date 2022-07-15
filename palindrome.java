import java.lang.Math;
class Palindrome{
	public static void main(String args[]){
		try{
			int pal = Integer.valueOf(args[0]);
			int num = pal;
			int rem, revnum = 0;
			int n = args[0].length();
			int i = n;
			while (i > 0){
				rem = num%10;
				revnum += rem*(Math.pow(10,i-1));
				num = num/10;
				i--;
				//System.out.println(rem+" "+num+" "+revnum+" "+i);
			}
			System.out.println(pal == revnum);
		}catch(Exception e){
			System.out.println("Invalid Input");
		}
	}
}