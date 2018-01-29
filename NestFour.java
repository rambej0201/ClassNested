class NestFour 
{
	void m1(){
		System.out.println("m1 NestFour class");
		class InnerFour
		{
			void m2(){System.out.println("m2 InnerFour class");}
			}
			InnerFour f = new InnerFour();
			f.m2();
		}
	
	void m3(){
		System.out.println("m3 NestFour class");
		class InnerFour
		{
			void m4(){System.out.println("m4 InnerFour class");}
			}
			InnerFour r = new InnerFour();
			r.m4();
		
	}


	public static void main(String[] args) 
	{
		NestFour n = new NestFour();
		n.m1();
		n.m3();
	}
}