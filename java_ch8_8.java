class cTest
{
	int a;
	
	void test()
	{
		if(a>0)
		{
			System.out.println("���Ƭ�����");
		}
		else if(a<0)
		{
			System.out.println("���Ƭ��t��");
		}
		else
		{
			System.out.println("���Ƭ�0");
		}
		return;
	}
}

public class java_ch8_8
{
	public static void main(String args[])
	{
		cTest test1=new cTest();
		test1.a=-4;
		System.out.println("-4"); 
		test1.test();
		
		cTest test2=new cTest();
		test2.a=8;
		System.out.println("8"); 
		test2.test();
		
		cTest test3=new cTest();
		test3.a=0;
		System.out.println("0"); 
		test3.test();
	}
}