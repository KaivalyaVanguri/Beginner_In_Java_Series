import java.util.Scanner;
class Even_occurence_del
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int[] a = new int[l];
		for(int i = 0; i<l; i++){
			a[i] = sc.nextInt();
		}
		int e = sc.nextInt();
		int count = 0;
		for (int j = 0; j < l; j++){
			if (a[j] == e)
				count += 1;
			if (a[j] == e && count%2 == 0)
				continue;
			else
				System.out.print(a[j]," ");
		} 
	}
}