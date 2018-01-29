class NestThree 
{
	int a = 15;
	int b = 25;
	class InnerThree
	{
		int a = 45;
		int b = 65;
		void m2(int a, int b){
			System.out.println(a+b);
			System.out.println(this.a+this.b);
			System.out.println(NestThree.this.a+NestThree.this.b);
		}
	}
}
class ThreeNest
{

	public static void main(String[] args) 
	{
		NestThree t = new NestThree();
		NestThree.InnerThree h = t.new InnerThree();
		h.m2(73,47);
	}
}
