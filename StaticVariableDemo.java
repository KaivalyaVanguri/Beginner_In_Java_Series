
class StaticVariableDemo

{static int i=10;
 public static void main(String args[])
  { System.out.println(i);
 }
}



/*
// static variable is common to all objects. 

Any static member can be accessed before any objects 
of its class are created, and without reference to any object.

*/
/*
class StaticVariableDemo
{ static int i=10;
  int j;
 public static void main(String args[])
  { StaticVariableDemo obj1=new StaticVariableDemo();
    StaticVariableDemo obj2=new StaticVariableDemo();
	obj1.i=30;
	obj1.j=20;
 	obj2.j=40;
	System.out.println(i+" "+obj1.i+" " +obj1.j);
	System.out.println(i+" "+obj2.i+" " +obj2.j);
  	i=50;
	System.out.println(i+" "+obj2.i+" " +obj1.j);
	System.out.println(i+" "+obj2.i+" " +obj2.j);

  }
}

*/




