package thread;

public class adding implements Runnable 
{
	int a,b;
	public adding(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void run()
	{
		add(a,b);
		}
	private void add(int a, int b)
	{
		int sum=0;
		synchronized(this)
		{
			System.out.println("enter the value of a");
			System.out.println("enter the value of b");
		    sum=a+b;
			System.out.println("Sum "+sum);
		}
	}

}

