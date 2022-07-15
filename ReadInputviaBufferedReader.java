import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ReadInputviaBufferedReader
{
	public static void main(String args[])throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name: ");
		String name = bf.readLine();
		System.out.println("Your name is "+name);
		System.out.println("Enter Roll No: ");
		long reg = Long.parseLong(bf.readLine());
		System.out.println("Your registration number is "+reg);
	}
}