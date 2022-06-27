class Caaa
{
	public int num1;
	public int num2;

	public Caaa()
	{
		num1=1;
		num2=1;
	}
	public Caaa(int a,int b)
	{
	num1=a;
	num2=b;
	}
}
	
class Cbbb extends Caaa
{
	public Cbbb()
	{
		
	}
	public Cbbb(int a,int b)
	{
	super(a,b);
	}
	public void show()
	{
		System.out.println("num1="+num1+", num2="+num2);
	}
}
public class practice0624
{
	public static void main(String args[])
	{
		Cbbb b1=new Cbbb();
		Cbbb b2=new Cbbb(3,9);
	
		b1.show();
		b2.show();
	}
}