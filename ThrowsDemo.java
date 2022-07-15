class ThrowsDemo{
	static void throwOne() throws IllegalAccessException{
		//this throws exception is required during method call
		System.out.println("Inside throwOne");
		throw new IllegalAccessException("demo");
	}
	public static void main(String[] args){
		try{
			throwOne();
		}catch(IllegalAccessException e){
			System.out.println("Caught "+e);
			//thrown exception should be handled by a try/catch block
		}
	}
}