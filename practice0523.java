public class practice0523
{
	public static void main(String args[])
	{
		tt t1=new tt();
		tt t2=new tt();
		t1.show();
		t2.show();
		tt.show();
	}
}
class tt
{
	static int count=0;
	public tt()
	{
		count++;
	}
	static void show()
	{
		System.out.println("Counter= "+ count);
	}
}
