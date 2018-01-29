class NestSix 
{
	void m1(){}
	void m2() {}
	}
	class InnerSix extends NestSix
	{
		void m1(){System.out.println("m1 method from InnerSix");}
		void m2(){System.out.println("m2 method from InnerSix");}
	}
	class SixNest 
	{
	public static void main(String[] args) 
	{
		InnerSix s = new InnerSix();
		s.m1();
		s.m2();
	}
}
