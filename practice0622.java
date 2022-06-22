class CRational
{
	public int n1;
	public int n2;
	
	public void setND(int num1,int num2)
	{
		n1=num1;
		n2=num2;
	}
	public CRational add(CRational r)
	{
		CRational a1=new CRational();
		a1.n1=this.n1*r.n2+this.n2*r.n1;
		a1.n2=this.n2*r.n2;
		return a1;
	}
	public CRational sub(CRational r)
	{
		CRational a1=new CRational();
		a1.n1=this.n1*r.n2-this.n2*r.n1;
		a1.n2=this.n2*r.n2;
		return a1;
	}
	public CRational mul(CRational r)
	{
		CRational a1=new CRational();
		a1.n1=this.n1*r.n2;
		a1.n2=this.n2*r.n1;
		return a1;
	}
	public CRational div(CRational r)
	{
		CRational a1=new CRational();
		a1.n1=this.n1*r.n1;
		a1.n2=this.n2*r.n2;
		return a1;
	}
	public void show(CRational r1,CRational r2,char ch)
	{
		System.out.print("(");
		System.out.print(r1.n1+"/"+r1.n2);
		System.out.print(")");
		System.out.print(ch);
		System.out.print("(");
		System.out.print(r2.n1+"/"+r2.n2);
		System.out.print(")=");
	}
}
public class practice0622
{
	public static void main(String args[])
	{
		CRational aaa=new CRational();
		CRational bbb=new CRational();
		CRational ccc;
		
		aaa.setND(1,2);
		bbb.setND(1,3);
		
		ccc=aaa.add(bbb); 
		show(ccc);
		
		ccc=aaa.sub(bbb);
		show(ccc);
		
		ccc=aaa.mul(bbb);
		show(ccc);
		
		ccc=aaa.div(bbb);
		show(ccc);
	}
		public static void show(CRational a1)
	{
		System.out.println(a1.n1+"/"+a1.n2);
	}
}