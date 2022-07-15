interface InterfaceStack{
	void push(int item);
	int pop();
}
class FixedStack implements InterfaceStack{
	private int stck[];
	private int tos;
	FixedStack(int size){
		stck = new int[size];
		tos = -1;
	}
	public void push(int item){
		if (tos == stck.length-1)
			System.out.println("Stack is Full");
		else
			stck[++tos] = item;
	}
	public int pop(){
		if (tos<0){
			System.out.println("Stack underflow");
			return 0;
		}else
			return stck[tos--];
	}
}

class Interface_Fixed_Stack{
	public static void main(String args[]){
		FixedStack s1 = new FixedStack(5);
		FixedStack s2 = new FixedStack(8);
		for (int i = 0; i<5; i++) s1.push(i);
		for (int i = 0; i<8; i++) s2.push(i);
		System.out.println("Stack in s1");
		for (int i = 0; i<5; i++) System.out.println(s1.pop());
		System.out.println("Stack in s2");		
		for (int i = 0; i<8; i++) System.out.println(s2.pop());
	}
}