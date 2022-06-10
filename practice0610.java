class CCircle
{
	private double pi=3.14;
	private double radius;

	public CCircle(double r)
	{
		radius=r;
	}
	public void show()
	{
		System.out.println("radius="+radius+", area="+pi*radius*radius);
	}
}

public class practice0610
{
	public static void main(String args[])
	{
		CCircle cirl=new CCircle(4.0);
		cirl.show();
	}
}