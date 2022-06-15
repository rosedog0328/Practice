abstract class Shape
{
	public abstract void area();
}
class Rectangle extends Shape
{
	double length, wideth;
	public Rectangle(double l,double w)
	{
		length=l;
		wideth=w;
	}
	public void area()
	{
		System.out.println("Rectangle area is :"+(length*wideth));
	}
	
}
class Circle extends Shape
{
	double radius;
	public Circle(double r)
	{
		radius=r;
	}
	public void area()
	{
		System.out.println("Circle area is :"+(3.14*radius*radius));
	}
}

public class practice0613
{
	public static void main(String args[])
	{
		Circle cake=new Circle(2.0);
		cake.area();
		Circle pizza=new Circle(3.0);
		pizza.area();
		Rectangle screen=new Rectangle(21,10);
		screen.area();
	}
}
