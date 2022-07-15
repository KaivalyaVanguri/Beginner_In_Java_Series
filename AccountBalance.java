package kaivalyaspkg;
/* java kaivalyaspkg.AccountBalance is the command line to be used and not java AccountBalance
 * As AccountBalanceis now part of the package kaivalyaspkg and can't be executed by itself.
 * Remember you will need to be in the directory above the kaivalyaspkg when you execute this command.
 */
class Balance{
	String name;
	double bal;

	Balance(String n, double b){
		name = n;
		bal = b;
	}
	void show(){
		if (bal<0)
			System.out.print("---> ");
		System.out.println(name+": $"+bal);
	}
}

class AccountBalance{
	public static void main(String args[]){
		Balance current[] = new Balance[3];
		current[0] = new Balance("K. J. Fielding",123.23);
		current[1] = new Balance("Will Tell",157.02);
		current[2] = new Balance("Tom Jackson",-12.33);
		for (int i = 0; i<3; i++) current[i].show();
	}
}