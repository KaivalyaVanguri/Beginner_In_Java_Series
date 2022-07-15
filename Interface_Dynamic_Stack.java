class DynamicStack implements InterfaceStack{
	private int stck[];
	private int tos;
	DynamicStack(int size){
		stck = new int[size];
		tos = -1;
	}
	public void push(int item){
		if (tos==stck.length-1){
			int temp[] = new int[stck.length*2];
			for (int i=0; i<stck.length; i++) temp[i] = stck[i];
			stck = temp;
			stck[++tos] = item;
		}else
			stck[++tos] = item;
	}
	public int pop(){
		if (tos<0){
			System.out.println("Stack Underflow");
			return 0;
		}else
			return stck[tos--];
	}
}	
	
class Interface_Dynamic_Stack{	
	public static void main(String[] args){
		DynamicStack ds1 = new DynamicStack(5);
		DynamicStack ds2 = new DynamicStack(8);
		for (int i = 0; i < 12; i++) ds1.push(i);
		for (int i = 0; i < 20; i++) ds2.push(i);
		System.out.println("Stack ds1");
		for (int i = 0; i < 12; i++) System.out.println(ds1.pop());
		System.out.println("Stack ds2");
		for (int i = 0; i < 20; i++) System.out.println(ds2.pop());
	}
}