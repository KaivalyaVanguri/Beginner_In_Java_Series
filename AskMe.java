import java.util.Random;
interface SharedConstants{
	int NO = 0; int YES = 1;
	int MAYBE = 2; int LATER = 3;
	int SOON = 4; int NEVER = 5;
/*If an interface contains no methods, then any class that includes
 *such an interface doesnt actually implement anything. It is as if
 *that class were importing the constant fields into the class name
 *space as final variables.*/
}
class Question implements SharedConstants{
	Random rand = new Random();
	int ask(){
		int prob = (int)(100*raand.nextDouble());//nextDouble randomly returns numbers in the range 0.0 to 1.0
		if (prob < 30) return NO;
		else if (prob < 60) return YES;
		else if (prob < 75) return LATER;
		else if (prob < 98) return SOON;
		else return NEVER;
	}
}
class AskMe implements SharedConstants{
	static void answer(int result){
		switch(result){
			case NO: System.out.println("No");
			case YES: System.out.println("Yes");
			case MAYBE: System.out.println("Maybe");
			case LATER: System.out.println("Later");
			case SOON: System.out.println("Soon");
			case NEVER: System.out.println("Never");}
	}
	public static void main(String[] args){
		Question q = new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
	}
}