//Inheritance: allowing a class to acquire properties of another existing class
class Parent{
	int parent_value;
	Parent(int par_v){
		parent_value = par_v;
	}
	}//superclass
class Child extends Parent{
	int child_value;
	Child(int p_v, int ch_v){
		//even if we don't invoke super class explicitly it gets automatically invoked like this super()
		super(p_v);
		child_value = ch_v;
	}
	void display(){
		System.out.println(parent_value+" "+child_value);
	}
}//subclass
class Inheritance_Demo1{
	public static void main(String[] args){
		//error no constructor of this type found  Parent obj1 = new Parent();
		Parent p = new Parent(5);
		System.out.println(p.parent_value);
		p.parent_value = 50;
		Child c = new Child(10,20);//object of derived class
		System.out.println(p.parent_value+" "+c.parent_value+" "+c.child_value);
	}
}
/*
> creating an object should be done in the main method as the execution always begins in the main method
> each class requires a seperate class file and while running the file demo.class file should be run as execution starts from main method.
> memory allocation of p.parent_value is not the same of c.parent_value
> super() is a reference variable
*/