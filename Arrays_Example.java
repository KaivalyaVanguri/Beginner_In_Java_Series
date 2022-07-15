import java.util.Scanner;
class Arrays_Example{
	public static void main(String[] args){
		//if memory is allocated at compile time then it is static allocation
		int[] a;
		//whereas if memory is allocated at run time then it is dynamic allocation.
		a = new int[5];
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
		int b[] = {1,2,3};
		System.out.println(b);//prints reference
		System.out.println(b[0]+" "+b[1]+" "+b[2]);
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++)
			a[i] = sc.nextInt();
		for(int i:a)
			System.out.println(i);
		int[] c;
		c = new int[]{1,2};
		for(int i:c)
			System.out.println(i);
			//Prints an additional line because i iterated through a 3 element array before iterating through c
			//i creates a view of elements in c and doesnt affect the values in the array itself
			//when we delete an element from the array we dont decrease its memory size but that particular location becomes empty.
		int d[][] = new int[][];//2d array
		
		
	}
}