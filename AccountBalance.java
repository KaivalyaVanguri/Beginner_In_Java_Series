class Balance 
{

String name;
double bal;

Balance(){}
Balance(Balance obj)
{name=obj.name; bal=obj.bal;}
Balance(String n, double b) 
{
name = n;
bal = b;
}

void show() 
{
if(bal<0)
System.out.print("--> ");
System.out.println(name + ": $" + bal);
}

}

class AccountBalance 
{
public static void main(String args[]) 
{
Balance b1 = new Balance("K. J. Fielding", 123.23);
Balance b2 = new Balance("Will Tell", 157.02);
Balance b3 = new Balance(b2);
b1.show();
b2.show();
b3.show();
b3.bal=200;
b2.show();
b3.show();

}
}

