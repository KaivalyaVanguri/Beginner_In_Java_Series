import java.util.Scanner;


/*
> Arrays of any type can be created and may have one or more dimensions.

> Syntax: int a[][]=new int[rowsize][colsize];
> Example : int a[][]=new int[2][3];
> Static Initialization : int a[][]={{1,2,3},{4,5,6}};


//Static initialization
class ArrDemo2
{ 
  public static void main(String args[])
  {int a[][]={{1,2},{3,4}};
     for (int i=0;i<a.length;i++)
     {   for (int j=0;j<a[i].length;j++)
           {System.out.print(a[i][j]+"  ");}
        System.out.println();
    }
  }
}
*/






/*
//Dynamic initialization
class ArrDemo2
{ 
  public static void main(String args[])
  {int a[][]=new int[2][3];

  System.out.println("Enter the elements of matrix :");
  Scanner scan=new Scanner(System.in); 
  for (int i=0;i<a.length;i++)
     for (int j=0;j<a[i].length;j++)
    {a[i][j]=scan.nextInt(); } 

   System.out.println("Matrix :"); 
   for (int i=0;i<a.length;i++)
     for (int j=0;j<a[i].length;j++)
    {System.out.println(a[i][j]);}
 
  }
}
*/

//Dynamic size and initialization
class ArrDemo2
{ 
  public static void main(String args[])
  { Scanner scan=new Scanner(System.in); 
    System.out.println("Enter the size of matrix :");
   int row=scan.nextInt();
   int col=scan.nextInt();

   int a[][]=new int[row][col];

  
  System.out.println("Enter the elements of matrix :");
   for (int i=0;i<row;i++)
     for (int j=0;j<col;j++)
    {a[i][j]=scan.nextInt(); } 
  System.out.println("Matrix :");
   for (int i=0;i<row;i++)
    { for (int j=0;j<col;j++)
      	System.out.print(a[i][j]+"  ");
     System.out.println();
     }
 
  }
}



