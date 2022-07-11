class StaticMethodDemo
{ static int i;
 
 static void Hello()
   {System.out.println("In static method");}

 void show()
{System.out.println("In non-static method");}

 public static void main(String args[])
  {
   Hello();
   show();
   System.out.println(i);
}
}


/* 
Any static member can be accessed before any objects of its class are created, 
and without reference to any object.

Restrictions on static methods
They can only directly call other static methods.
They can only directly access static data.
They cannot refer to this or super in any way.
*/