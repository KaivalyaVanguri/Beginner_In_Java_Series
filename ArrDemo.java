import java.util.Scanner;
//1D Array
/*
class ArrDemo
{ 
  public static void main(String args[])
  {int a[];
   a=new int[5];
   for (int i=0;i<a.length;i++)
    {System.out.println(a[i]);}
System.out.println();
 
  }
}









> Like typed (homogenous)values can be stored in an array
> Can contain primitive datatypes as well as objects of a class.

> Syntax: datatype varname[];  (or) datatype[] varname;

> Elements are accessed using index.
> Array index starts from 0.
> Array elements are stored sequentially.
> size of the array must be specified by int but not long or double.
> In Java Arrays are dynamically allocated.

Syntax: datatype varname[] = new datatype[size];
Example: int a[]=new int[3];

> Elements are initialized with their default values.
> Arrays of any type can be created and may have one or more dimensions.
When size and values are known array literals can be used.

Example:
 int a[]=new int[]{1,2,3,4,5,6,7,8,9,10} ;
 (or)
 int a[]={1,2,3,4,5,6,7,8,9,10} ;



*/

class ArrDemo
{ 
  public static void main(String args[])
  {Scanner scan=new Scanner(System.in);
   int a[];
   a=new int[5];
     
System.out.println("Enter the elements of the array :"); 
   for(int i=0;i<5;i++)
     a[i]=scan.nextInt();

System.out.println("The array elements are : ");
    for (int temp:a)
    {System.out.println(temp);}
 
  }
}



















 // int a[]={1,2};
/*
int b[]=a;
 b[0]=1;   
 for (int i=0;i<a.length;i++)
    {System.out.println(a[i]);}
System.out.println();
for (int i=0;i<b.length;i++)
  {System.out.println(b[i]);}

*/