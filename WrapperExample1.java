public class WrapperExample1
{  
 public static void main(String args[])
 {  
  //Converting int into Integer  

        int b = 10;    // int data type 

        Integer intobj = new Integer(b); //wrapping around Integer object 
  
	int iv = intobj.intValue(); 	//Unwrapping


   System.out.println(b+" "+intobj+" "+iv);  
 }
} 
