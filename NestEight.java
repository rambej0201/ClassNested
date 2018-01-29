class Thread 
{
	public void run(){}
}
class MyThread extends Thread
{
	//overriding the run() method
	public void run(){
		System.out.println("run() method of MyThread extended from Thread class");
}
}
class TestClient
{
	//declare an object of MyThread class to invoke run()
	public static void main(String[] args) 
	{
		MyThread m = new MyThread();
		m.run();
	}
}
