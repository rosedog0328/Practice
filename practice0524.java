public class practice0524
{
	public static void main(String args[])
	{
		int num=5;
		add10(num);
		System.out.println("in main(), num = "+num);
	}
	
	public static void	add10(int value)
	{
		value=value+10;
		System.out.println("in add(), value = "+value);
	}
}