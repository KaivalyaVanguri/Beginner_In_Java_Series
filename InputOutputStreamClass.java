import java.io.*;
class InputOutputStreamClass
{
	public static void main(String[] args)throws IOException
	{
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters press 'q' to exit");
		do {
			c = (char)br.read();
			System.out.println(c);
		}while(c!='q');
	}
}
/*file 
memory ----> character stream classes
disk 
network ----> byte stream classes are more used
These are abstract classes on which we cannot create objects. 
It helps us to create a hierarchy of classes ----> works like a holder
Buffer is an intermediate storage of sequence of memory allocations they carry information from input peripheral devices to the output. Streams can be considered as classes. Buffer is a physical device that exists, bytes are logical entities
to and fro info via inp/out streams 
Byte ----> Input Stream
|
-----> Output Stream
Byte Stream------>PrintStream BufferedInputStream DataInputStream 
Every Stream has read and write streams
Character Stream ------> BufferedReader BufferedWriter handles respective Stream
FileReader FileWriter -----> Input/Output Stream that read/write from file
InputStreamReader -----> Input Stream translates from byte to character 
OutputStreamReader ------> Output Stream translates char to byte
Reader Writer 
PrintWriter o/p stream contains print(), println()

InputStreamReader ir = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(ir);
read() for single character
readLine() for a string of characters
Java uses Unicode Character Set unlike Python which uses ASCII
br.read() ----> Even if we give a string of characters its still going to treat each character as a seperate entity and print it seperately.
eg: dfdfdf
d
f
d
f
d
f
br.readLine() -----> if we give a string of characters  or even a character it is still treated as a string and print its as follows.
eg: dfdfdf ghghgh
dfdfdf ghghgh
*/