package thread;

public class Addnumbersusing2threads
{
	public static void main(String[] args) 
	{
		Thread t1= new Thread(new adding(3,9));
		Thread t2= new Thread(new adding(4,6));
		t1.start();
		t2.start();
		
	}

}
