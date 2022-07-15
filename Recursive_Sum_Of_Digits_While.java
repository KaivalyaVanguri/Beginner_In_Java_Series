import java.util.Scanner;
public class Recursive_Sum_Of_Digits_While
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int count = 0;
        boolean b = true;
        int l = String.valueOf(i).length();
        while(i>0 & l != 1 & b != false){ 
            l = String.valueOf(i).length();
            count += i%10;
            i = (int)(i/10);
            if (i == 0 & count>0 & String.valueOf(count).length() != 1){
                i = count;
                count = 0;
                l = String.valueOf(i).length();}
            else if (i == 0 & count>0 & String.valueOf(count).length() == 1){
                b = false;}
        }
        System.out.println("Recursive Sum Of digits is "+count);
    }
}
