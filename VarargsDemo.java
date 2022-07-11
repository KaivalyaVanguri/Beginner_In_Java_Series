/*
class VarargsDemo
{  public static void varfun(int ... x) 
   {  System.out.println("Number of arguments: " + x.length);
      for (int i: x)
        System.out.println(i + " ");
   }
  public static void main(String args[])
  {varfun(1);
   varfun(1,2,3,4);
   varfun(10,20);
   varfun(150,50,20);
    varfun();
  }
}


Varargs- sometimes methods need to take a variable number of arguments.
Syntax : A variable-length argument is specified by three periods(…). 
Example:
public static void fun1(int ... x) 
{
   // method body
}
This syntax tells the compiler that fun( ) can be called with zero or more arguments. 
As a result, here x is implicitly declared as an array of type int[].
The arguments should be stored in the array referred to by x.
*/

class VarargsDemo
{  public static void varfun(double a, int ... x) 
   {  System.out.println("double: " + a);
      System.out.println("Number of arguments: " + x.length);
      for (int i: x)
        System.out.println(i + " ");
   }
  public static void main(String args[])
  {varfun(101,1);
   varfun(1,2,3,4);
  varfun(10,20);
  varfun(20);
  varfun("sfsd");
  }
}


/*
Note: A method can have variable length parameters with other parameters too,
 but one should ensure that there exists only one varargs 
parameter that should be written last in the parameter list of the method declaration.

*/