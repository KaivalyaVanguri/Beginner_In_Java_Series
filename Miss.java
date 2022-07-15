import java.util.Scanner;
import java.util.Arrays;
class Miss
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n-1];
        for (int i = 0; i<n; i++ ){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 1; i<=n; i++){
            if (a[i-1] != i){
                System.out.println(i);
                break;
            }
        }
	}
}