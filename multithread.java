import java.util.*;
class randomthread
{
	public static void main(String args[])
	{

		random r1=new random();
		r1.start();
	}
}
class random extends Thread
{
	public void run()
	{
	Scanner sc=new Scanner(System.in);
	square s=new square();
	cube c=new cube();
	System.out.print("enter the no. of random numbers");
	int n1=sc.nextInt();
	Random r=new Random();
	for(int i=0;i<n1;i++)
	{
	int n=r.nextInt(10);
	System.out.println("random no.="+n);
	if(n%2==0)
	    s.run(n);
	else
	    c.run(n);
    try{Thread.sleep(1000);}catch(InterruptedException e){};
   }
}
}
class square extends Thread
{
	public void run(int n)
	{
		System.out.println("square is"+(n*n));
	}
}
class cube extends Thread
{
	public void run(int n) 
	{
		System.out.println("cube="+(n*n*n));
	}
}