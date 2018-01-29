class NestNine 
{
	MyThread m = new MyThread()
	{public void run(){
	System.out.println("run() method of MyThread Anounymous class");
	System.out.println(m.getClass().getName());
	}
	};
	public static void main(String[] args) 
	{
		NestNine n = new NestNine();
		n.m.run();
	}
}
