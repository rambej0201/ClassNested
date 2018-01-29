class NestSeven 
{
	void m1(){}
	void m2(){}
	}
	//lets write code with anonymous class without InnerSix type of class decalred in NestSix.java
	class SevenNest
	{
		NestSeven s = new NestSeven()
		{void m1(){System.out.println("M1 Method from anonymous class");}
		void m2(){System.out.println("M2 Method from anonymous class");
		System.out.println(s.getClass().getName());}
		};
	public static void main(String[] args) 
	{
		SevenNest sn = new SevenNest();
		sn.s.m1();
		sn.s.m2();

		
	}
}
