import java.io.*;
import java.util.*;
class max<T extends Comparable<T>>

{
    int n;
    T[] arr;
        
       max(int n,T[] a)
	{
		this.n=n;
		arr=a;
	}
	 T maxi()
	{
		T m=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i].compareTo(m)>0)
			m=arr[i];
		}
                
                return m;
	}
	
}
public class genericmax
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of elements of integer set:");
		int n=sc.nextInt();
        Integer a[]=new Integer[10];
                System.out.println("enter elements:");
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
        max<Integer> obj=new max<Integer>(n,a);
		System.out.println("maximum element is "+obj.maxi());
		System.out.print("enter the number of elements of double sets:");
		int n1=sc.nextInt();
        Double d[]=new Double[10];
                System.out.println("enter elements:");
		for(int i=0;i<n1;i++)
		d[i]=sc.nextDouble();
        max<Double> obj1=new max<Double>(n,d);
		System.out.println("maximum element is "+obj1.maxi());
		System.out.print("enter the number of elements of character set:");
		int n2=sc.nextInt();
        Character c[]=new Character[10];
                System.out.println("enter elements:");
		for(int i=0;i<n2;i++)
		c[i]=sc.next().charAt(0);
        max<Character> obj2=new max<Character>(n,c);
		System.out.println("maximum element is "+obj2.maxi());
        
		
		
	}
}