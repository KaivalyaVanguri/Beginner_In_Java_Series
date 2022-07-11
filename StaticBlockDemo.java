/*
class StaticBlockDemo
{ static int i;

 static void Hello()
   {System.out.println("In static method");}

 static
  { i=10;

   System.out.println("In static Block");
  }

 public static void main(String args[])
  {
   Hello();
 System.out.println(i);
}
}

*/








/*
class StaticBlockDemo
{ static int i=10;
   static int j;
 
 static void Hello()
   {System.out.println("In static method");}
 static
 {
  System.out.println("In static Block");
   j=20;
  }
 public static void main(String args[])
  {System.out.println("In Main " );
    Hello();
   System.out.println(" i : "+i);
   System.out.println(" j : "+j);
}
}

*/

// Static block and variables are executed in the order they are present
class StaticBlockDemo
{ 
  static int i=Hello();
 static int j; 
  static
  { 
  System.out.println("In static Block");
   j=20;
  }
 
 static int Hello()
   {System.out.println("In static method");
    return 100;}
 public static void main(String args[])
  {System.out.println("In Main " );
   System.out.println(" i : "+i);
   System.out.println(" j : "+j);
}
}
