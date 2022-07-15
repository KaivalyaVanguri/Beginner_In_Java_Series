import java.util.*;
class HybridInheritance{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		GrandParent gp = new GrandParent(a);
		Parent1 p1 = new Parent1(a,b);
		Parent2 p2 = new Parent2(a,c);
		Child1 c1 = new Child1();
		I1 i1;//we can create references for interfaces and not objects just like final class
		I2 i2;
		I3 i3;
		//therefore we cant access the variables inside interfaces
		//System.out.println(i3.a+" "+i3.b+" "+i3.c);
		Child2 c2 = new Child2();
	}
}
class GrandParent{
	int a;
	GrandParent(int a){
		a = a;
	}
}
class Parent1 extends GrandParent{
	int l;
	Parent1(int a, int b){
		super(a);
		l = b;
	}
}
class Parent2 extends GrandParent{//Hierarchial Inheritance
	int c;
	Parent2(int a, int c){
		super(a);
		c = c;
	}
}
class Child1 extends Parent2{
	/*Child1(){//Unparameterized Constructor//Multilevel Inheritance
	}gives an error*/
}
interface I1{
	//additional feature because of it multiple inheritance is possible
	public final int a = 5;
	public final int b = 10;
	//a = 5;
	//b = 10;
	int method1();//Abstract methods and public final variables are the members of the interface
}
interface I2{
	public final int c = 5;//you cant just declare static variables without initializing them in the firstline itself.
	int method2();
}
interface I3 extends I1,I2{
//Multiple Interface inheritance is possible
	int method3();
}
class Child2 implements I1,I2{//Multiple Inheritance
	int method1(int h){
		return h;	
	}
	int method2(int g){//the rightmost code will give an error method overriding should take place: int method2(){
		return g;
	}
	int method3(int f){
		return f;
	}
}