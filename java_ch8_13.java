class CCircle
{
	
	double area(double r)
	{
		return r*r*3.14;
	}
	float area(float r)
	{
		return r*r*3.14f;
	}
	double area(int r)
	{
		return r*r*3.14;
	}
	
}

public class java_ch8_13
{
	public static void main(String args[])
	{
		CCircle cirl=new CCircle();
		
		System.out.println("area(2)= "+cirl.area(2));
		System.out.println("area(2.2f)= "+cirl.area(2.2f));
		System.out.println("area(2.2)= "+cirl.area(2.2));
	}
}