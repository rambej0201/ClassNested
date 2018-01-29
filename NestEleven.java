interface NestEleven 
{
	void m1();
	void m2();
	}
	class ElevenNest
	{
	NestEleven ne = new NestEleven()
		{public void m1(){System.out.println("M1 Method NestEleven interface");}
		public void m2(){System.out.println("M2 Method NestEleven interface");
		System.out.println(ne.getClass().getName());}
	};
	public static void main(String[] args) 
	{
		ElevenNest en = new ElevenNest();
		en.ne.m1();
		en.ne.m2();
		
	}
}
