import java.util.Scanner;
class Combinations
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int k =  sc.nextInt();
		int[][] arr;
		System.out.print("[");
		for (int i = 1; i < n; i++){
			System.out.print("["+i+",");
			for (int j = i+1; j < n; j++){
				System.out.print(j+" ");
			}
			System.out.print("]");
		}
		System.out.print("]");
	}
}