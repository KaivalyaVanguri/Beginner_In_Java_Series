import java.util.Scanner;

public class Two_Numbers
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      int a = 0, b = 0;// Keep prompting the user until the input is correct
      
      do{
         System.out.println("Enter two positive integers, the first smaller than the second.");
         System.out.print("First: ");
         a = in.nextInt();
         //if (a<b){
            //break;}
         System.out.print("Second: ");
         b = in.nextInt();

      }while(a>=b || (a==0 && b!=0));// Only print this when the input is correct
      
      System.out.println("You entered " + a + " and " + b);
   }
}