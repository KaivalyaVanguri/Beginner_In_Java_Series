import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Practice
{
	public static void main(String args[]) throws IOException{
		System.out.println();
		System.out.println("Type Conversion"+" and Type Promotion");
		System.out.println();
		int a,i,j = (int)0.0;
		boolean b;
		char c = 'A';
		double d = 22/7d;
		float f = 12.05f;
		byte e = 10, h = 30;
		short g = 200;
		long l = 123l;
		System.out.println("ASCII code for A "+(c+j)); 
		//System.out.println(a+", "+b+", "+c+", "+d); shows an error
		float k = (float)d;
		float m = (float)(e*d*f);
		i = e*g+h;
		a = (int)(e-g+h-l);
		System.out.println(a+" "+i+" "+j+" "+d+" "+f+" "+l+" "+k+" "+m);
		System.out.println();
		System.out.println("Scope of a variable");
		System.out.println();
		a = 10;
		if (a%2 == 0){
			int x = a;
			b = a==x;
			System.out.println(a==x);
		}
		//System.out.println(a==x); shows an error
		System.out.println();
		System.out.println("Ternary Operator");
		System.out.println();
		System.out.println((a%2==0)?1:0);
		System.out.println("Conversion of Minutes into Years and Days");
		long seconds = 2891233455678987654L;
		int days = (int)(seconds/(3600*24));
		int years = (int)(seconds/(3600*24*365));
		System.out.println("Number Of Seconds: "+seconds);
		System.out.println("Number Of Days: "+days);
		System.out.println("Number Of Years: "+years);
		System.out.println();
		System.out.println("By using User's Input");
		System.out.println();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of minutes");
		int min = Integer.parseInt(bf.readLine());
		System.out.println("Are You Ready?? Type the magic Words..... Answer in caps!!");
		String str = bf.readLine();
		if(str.startsWith("YES")){
			System.out.println("Smart Answer, Keep It Up! :)");
			float idays = (min/(60*24));
			float iyears = (min/(60*24*365));
			System.out.println("Number Of Days: "+idays);
			System.out.println("Number Of Years: "+iyears);
		}
		else if(str.startsWith("NO")){
			System.out.println("Sorry! Better Luck Next time :(");
		}
		
/*Practice.java:8: error: variable a might not have been initialized
                System.out.println(a+", "+b+", "+c+", "+d);
                                   ^
Practice.java:8: error: variable b might not have been initialized
                System.out.println(a+", "+b+", "+c+", "+d);
                                          ^
Practice.java:8: error: variable c might not have been initialized
                System.out.println(a+", "+b+", "+c+", "+d);
                                                 ^
Practice.java:8: error: variable d might not have been initialized
                System.out.println(a+", "+b+", "+c+", "+d);*/
/*cannot find symbol
  System.out.println(a==x);;
           ^
  symbol:   variable x
  location: class Practice */
	}
}