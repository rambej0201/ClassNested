class NestTwo 
{
	int a = 15;
	int b = 25;
	void m1(){System.out.println(a+b);}
	class InnerTwo {
		int x = 45;
		int y = 65;
		void m2(int p, int q){
			System.out.println(x+y);//current class variables
			System.out.println(p+q);//local variables
			System.out.println(a+b);//outer class variables
		}
	}
}
	class TwoNest 
	{	public static void main(String[] args) 
	{
		NestTwo t = new NestTwo();
		NestTwo.InnerTwo w = t.new InnerTwo();
		w.m2(73, 47);
	}
}
