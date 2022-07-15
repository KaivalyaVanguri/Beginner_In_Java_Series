#Create a 1d array By reading the size and elements from the user and find the maximum element
#Create a 2d array By reading the size and elements from the user and find the minimum element in the each row and store the min elements in an array and display the result
#Create an array and sort in ascending and descending order.
#Create an array of employee objects and display their details. name sal id
class VarArgsDemo
{
	public static void varfun(String name, int ... x)
	{
		System.out.println("Name: "+name);
		System.out.println("Number Of Arguments: "+x.length);
		for (int i:x)
			System.out.println(i+" ");
	}
	public static void main(String args[])
	{
		varfun("Kai",1);
		varfun("Kai",1,2,3,4);
		varfun("Kai",10,20);
		varfun("Kai",150,50,20);
		varfun("");
	}
}