class FinallyDemo{
	static void procA(){
		try{
			System.out.println("Inside procA");
			throw new RuntimeException("demo");
		}finally{
			System.out.println("procA's finally after catching the error");
		}
	}
	static void procB(){
		try{
			System.out.println("Inside procB");
			return;
		}finally{
			System.out.println("procB's finally after return statement inside try block");
		}
	}
	static void procC(){
		try{
			System.out.println("Inside procC");
		}finally{
			System.out.println("procC's finally on normal conditions");
		}
	}
	public static void main(String[] args){
		try{
			procA();
		}catch(Exception e){
			System.out.println("ProcA's catch block, here is the exception "+ e);
		}
		procB();
		procC();
	}
}