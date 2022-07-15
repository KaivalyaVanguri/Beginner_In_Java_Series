import java.util.*;
public class Floyds_Triangle_For
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = 1;
        for (int i=1; i<=num; i++)
        {   
            for(int j=1; j<=i; j++)
            {
                System.out.print(k+" ");
                k++;
            }
            
            System.out.println();
        }
    }
}