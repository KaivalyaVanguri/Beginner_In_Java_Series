//Create a 2d array By reading the size and elements from the user and find the minimum element in the each row 
//and store the min elements in an array and display the result
//Create an array and sort in ascending and descending order.
//Create an array of employee objects and display their details. name sal id
import java.io.*;
class Two_D_Array_Min
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(bf.readLine());
		int n = Integer.parseInt(bf.readLine());
		int[][] arr_2 = new int[m][n]; 
		int arr[] = new int[m]; 
		for(int i = 0 ; i < arr_2.length; i++)
		{
			for (int j = 0; j < arr_2[i].length; j++)
			{
				arr_2[i][j] = Integer.parseInt(bf.readLine());
				if (arr_2[i][j]<arr[i] || arr[i] == 0)
					arr[i] = arr_2[i][j];
			}
		}
		for (int k : arr)
			System.out.println("Array of Minimum Elements in each row"+k);
		//a[k] will not work here........think about it********
	}
}
//for (int j : arr_2[i]) in place of the inner for loop
/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2 at Two_D_Array_Min.main(Two_D_Array_Min.java:25)*/