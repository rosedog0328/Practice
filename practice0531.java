class Shape
{
	double high;
	double leng;
	public double area()
	{
		
		return high*leng;//?[???n
	}
	public static void largest(Shape a[])
	{
		double max=0;
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i].area())
				max=a[i].area();
		}
		System.out.println("THe largest area is "+max);
	}
}
class Circle extends Shape
{
	double pi=3.14;
	double radius;
	public Circle(double r)
	{
		radius=r;
	}
	public double area()
	{
		return pi*radius*radius;
	}
}
class Rect extends Shape
{
	double width;
	double height;
	public Rect(double w, double h)
	{
		width=w;
		height=h;
	}
	public double area()
	{
		return width*height;
	}
}

class Tria extends Shape
{
	double base;
	double height;
	public Tria(double b,double h)
	{
		base=b;
		height=h;
	}
	public double area()
	{
		return base*height/2;
	}
}



public class practice0531
{
	public static void main(String args[])
	{
		Shape arr[]=new Shape[5];
		arr[0]=new Circle(2.0);
		arr[1]=new Rect(3.0,4.0);
		arr[2]=new Rect(2.0,5.0);
		arr[3]=new Rect(3.0,6.0);
		arr[4]=new Tria(5.0,10.0);
		Shape.largest(arr);
	}
}