package factorial;

import java.util.*;

public class Fact
{
	public static void main(String[] args)
	{
		int n,i;
		char a=1;
		System.out.println("enter the number for which factorial is to be found");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==0)
		{
			System.out.println("the factorial is 1");
			
		}
		if(n==1)
		{
			System.out.println("the factorial is 1");
	    }
		for(i=n-1;i>=a;i--)
		{
			n=n*i;
		}
		System.out.println("the factorial "+n);
		System.out.println("do you want to continue(Y/N)");
		a=sc.next(".").charAt(0);
		while(a=='Y')
		{
	    System.out.println("enter the number for which factoral is to be found");
		n=sc.nextInt();
		if(n==0)
		{
			System.out.println("the factorial is 1");
		}
		if(n==1)
		{
			System.out.println("the factorial is 1");
		}
		for(i=n-1;i>=1;i--)
		{
			n=n*i;
		}
		System.out.println("the factorial is "+n);
		System.out.println("do you want to continue(Y/N)");
		a=sc.next(".").charAt(0);
		}
		if(a=='N')
		{
			System.out.println();
		}
		}
		
	}
	


