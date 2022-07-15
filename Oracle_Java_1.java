import java.util.Scanner;
class Oracle_Java_1
{
	public static void main(String[] args) throws java.io.IOException//handling input errors
	{/* Exception Handling provides a structured method by which runtime errors can be tracked and handled by your program. 
 		exception handling mechanism allows your program to perform a non local branch */
		//int _ = 5;//raises a keyword error
		long roll_num = 12_20_10_333_028L;//enhances readability
		System.out.println("Numbers with underscores "+roll_num);
		byte b1 = (byte)-129, b2 = (byte)128, b3 = (byte)300, b4 = (byte)-200;//arithmetic modulo
		System.out.println("Bytes above its range takes modulo value "+b1+" "+b2+" "+b3+" "+b4);//127 -128 44 56 are the values displayed 
		byte b = 50;
		//b = b*2;//error cannot assign an int to a byte!
		b *= 2;
		System.out.println(b); 
		System.out.print("Post increment");
		for (int i = 0; i<5; i++) System.out.print(i+" ");
		System.out.print("\nPre increment");
		for (int i = 0; i<5; ++i) System.out.print(i+" "); //No difference at all
		System.out.print("\nPost decrement");
		for (int i = 5; i>0; i--) System.out.print(i+" "); 
		System.out.print("\nPre decrement");
		for (int i = 5; i>0; --i) System.out.print(i+" "); //No difference at all
		//The quotient of 2 integers is always a floor value of the actual quotient of those 2 numbers, i.e., no floating point values are attached to it.
		System.out.println("\nPre decrement as the first executable statement in for loop");
		for (int i = 5; i>0;) {
			i--;//--i;//same results 4 3 2 1 0
			System.out.print(i+" ");
		}System.out.println("\nPre decrement as the last executable statement in for loop");
		for (int i = 5; i>0;) {
			System.out.print(i+" ");
			i--;//--i;//same results 5 4 3 2 1
		}
		//if you left shift a byte type or short type value that value will be first promoted to int and then shifted. For this you must discard top 3 bytes
		// of result by simply casting the result value back to byte 
		String name = "Kaivalya";//this feature of having string type in switch expression is possible from JDK 7 versions and above only

		switch(name){
			case "Kaivalya":
			case "kaivalya":
				System.out.println("Youngest");
			case "KAIVALYA"://doesnt print youngest
				break;
			case "Geeta":
			case "geeta":
			case "GEETA":
				System.out.println("Younger");
				break;
			case "Sreenivas":
			case "sreenivas":
			case "SREENIVAS":
				System.out.println("Young");
				break;
			default:
				System.out.println("Not a family member");//switch can only test for equality, no 2 case constants can have identical values.
			//more efficient than nested if because all the case constants are of same datatype
		}
		int i = 100, j = 300;
		while(++i<--j);//while(i++<j--);//gives answer i as 201, j as 199//this type of loop contains no loop body
		System.out.println("Midway of 100 and 300 is "+i);//i==j value
		int n = 10;
		do{
			System.out.print(n+" ");
		}while(--n>0);
		char choice;
		do{
			System.out.println("Help on: ");
			System.out.println("1. If ");
			System.out.println("2. Switch ");
			System.out.println("3. do-while ");
			System.out.println("4. While ");
			System.out.println("5. For\n");
			System.out.println("Choose one");
			choice = (char)System.in.read();//reads a String
		}while(choice < '1' || choice > '5');
		int num = 3;
		boolean isPrime;
		if (num<2) isPrime = false;
		else isPrime = true;
		for (i=2; i<=num/i; i++){
			if ((num%i)==0){
				isPrime = false;
				break;
			}
		}
		if (isPrime) System.out.println("Prime");
		else System.out.println("Not Prime");
		//operating system command processors require infinite for loop
		//for each iteration variable is read only
		int[][] nums = {{1,2,3},{4,5},{6,7,8,9}};
		for(int[] x: nums){
			for(int y: x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		/*Break is a civilized form of goto 
		Goto ridden code Is hard to understand and prohibits certain compiler optimisations 
 		Goto is useful when you are exiting from deeply nested set of loops
		Labelled break system
		Break label;//name of a label that identifies a block of code
		Continue may specify a label to describe which enclosing loop to continue for eg. continue outer;
		return is used to explicitly return from a statement.
		*/
		boolean t = true;
		first:{//similarly a for statement can also be labelled like= outer: for(i = 0; i<10; i++){}
			second:{
				third:{
					System.out.println("before the break");
					if(t) break second;
					System.out.println("after the break wont execute inside third");}
				System.out.println("after the break wont execute inside second");
				}
			System.out.println("after the break will execute inside first");
			}
		/*
		> Implicit return type of a class' constructor is the class type itself.
		// 7th fri 5th wed jan 2022
		> Methods whose parameter declarations are different but method names are same and exist in the same class, this process is referred to as Method Overloading.
		> Java supports Polymorphism. Return types dont play a role in overload resolution.
		> Java resorts to automatic type conversions only if no exact match is found during method call
		> test(int) method call is raised to test(double) if former doesnt exist while the latter does.*/
		Box box1 = new Box(1,2,3);
		Box box2 = new Box(b,b,b);
		System.out.println("Are box1 and box2 the same?? "+box1.equalsTo(box2));
		
	}
}
class Box{
	double width;
	double height;
	double depth;
	/*Box(double w, double h, double d){
		this.width = w;//redundant use of this keyword.
		this.height = h;//redundant use of this keyword.
		this.depth = d;//redundant use of this keyword.
	}this is a perfectly working constructor*/
	Box(double width, double height, double depth){
		this.width = width;//resolving name-space collisions.
		this.height = height;//resolving name-space collisions.
		this.depth = depth;//resolving name-space collisions.
	}
	boolean equalsTo(Box o){
		if (o.width==width && o.height==height && o.depth==depth)
			return true;
		return false;
	}
	/*JAVA'S GARBAGE COLLECTION
	> Garbage collection occurs only sporadically if at all during the execution of your program 
	*/
}
class Stack{
	int stack[] = new int[10];
	int count;

	Stack(){
		count = -1;
	}	
		
	void push(int element){
		if (count == 9)
			System.out.println("Stack is Full");
		else
			stack[++count] = element;
	}
	
	int pop(){
		if (count < 0){
			System.out.println("Stack underflow!");
			return 0;
		}else
			return stack[count--];
			
	}
}
/*
> CALL BY VALUE:
> This approach copies the value of an argument into the formal parameter of the subroutine.
> changes made to the parameter of the subroutine have no effect on the argument.
> CALL BY REFERENCE:
> a reference to the argument not the value of argument is passed to parameter.
*/