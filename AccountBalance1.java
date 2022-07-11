class Balance 
{

String name;
double bal;
Balance(){}
Balance(double d){bal=d;}
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

String issame(Balance obj)
{ if (obj.bal==bal) return "same";
   else return "not same";}
Balance inc()
{Balance temp=new Balance(bal+100);
  return temp;}
}
class AccountBalance1 
{
public static void main(String args[]) 
{
Balance b1 = new Balance("K. J. Fielding", 123.23);
Balance b2 = new Balance("Will Tell", 157.02);
Balance b3 = new Balance("Tom Jackson", 123.23);
b1.show();
b2.show();
b3.show();
System.out.println(b1.issame(b3));
Balance b4;
b4=b3.inc();
b4.show();

}
}

