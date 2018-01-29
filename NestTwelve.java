abstract class NestTwelve 
{ abstract void m1();
}
class TwelveNest
{
	NestTwelve nt = new NestTwelve(){
		void m1(){System.out.println("M1 Method through NestTwelve abstract class");
		System.out.println(nt.getClass().getName());}
	};
	public static void main(String[] args) 
	{
		TwelveNest tn = new TwelveNest();
		tn.nt.m1();
	}
}
