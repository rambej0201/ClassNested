class NestOne 
{
	int a = 10;
	int b = 20;
	void m1(){System.out.println(a+b);}
	class NestInner
	{
		int x = 100;
		int y = 200;
		void m2(){
			System.out.println(a+b);
			System.out.println(x+y);
			m1();
	}
}
}
class OneNest
{
	public static void main(String[] args) 
	{
		NestOne o = new NestOne();
		o.m1();
		NestOne.NestInner i = o.new NestInner();
		i.m2();

	}
}
