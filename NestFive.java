class NestFive 
{
	static int a = 30;
	int b = 40;
	static class InnerFive
	{
		void m1(){
			System.out.println(a);
			//System.out.println(b);
		}
	}
}
class FiveNest
{
	public static void main(String[] args) 
	{
		NestFive.InnerFive f = new NestFive.InnerFive();
		f.m1();
	}
}
