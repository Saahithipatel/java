class X
{
	void f1()
	{
		System.out.println("Called without any parameters");
	}
	void f1(int x)
	{
	
		System.out.println("Called with 1 parameter x="+x);
	}
	void f1(int x,int y)
	{
	
		System.out.println("Called with 2 parameters x="+x+" y="+y);
	}
}

class MethodOverloading
{
	public static void main(String args[]) 
	{
		X ob=new X();
		ob.f1();
		ob.f1(3);
		ob.f1(3,1);
	}
}

