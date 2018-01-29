interface  NestTen
{
	void m1();
	void m2();
}
class Test implements NestTen
{
	public void m1(){System.out.println("M1 Method Test-NestOne");}
	public void m2(){System.out.println("M2 Method Test-NestOne");}
}
class TestClient
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.m1();
		t.m2();
		System.out.println("Hello World!");
	}
}
