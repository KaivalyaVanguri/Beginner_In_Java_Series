/*Wrapper Class is for primitive datatypes
Datatype to Object -----> Autoboxing
Object to Primitive Datatype -----> Unboxing
int i = 10;
double d = 10d;
Primitive to Object constructor is used
Object to Primitive Wrapper class is used
Integer iVal = new Integer(int);//Converts primitive int to Integer Object
Integer iVal = new Integer(i);//Converts primitive int to Integer Object
Double dVal = new Double(d);//Converts primitive int to Integer Object
Float fVal = new Float(3.14f);//Converts primitive int to Integer Object
long l = lVal.longValue();
float f = fval.floatValue();
ival is an object of integer type
Converting Numbers to String using toString() method
String str = Long.toString();
String str = Float.toString();
ValueOf() is used to convert strings to Objects
Converting numeric strings via parsing to primitive datatype 
int i = Integer.parseInt(str);
long i = Long.parselong(str);
XXXXXX
ival = Integer.valueOf(str);
*/
public class WrapperExample1
{
	public static void main(String[] args)
	{
		//Converting int into integer
		int b = 10;//int data type
		Integer intobj = new Integer(b);//wrapping around Integer Object
		int iv = intobj.intValue();//Unwrapping
		
		System.out.println(b+" "+intobj+" "+iv);
	}
}
