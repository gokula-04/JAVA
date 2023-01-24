import java.util.*;
class stack
{
    public static void main(String[] args) 
	{
        int i,n,top=-1,ch=0,push,pop;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter stack size:");
        n=sc.nextInt();
        int[] stack=new int[n];
        System.out.println("MENU\n1.Push 2.Pop 3.Peek 4.Display 5.Exit\n");
	 while(ch!=5)
	 {
	  	System.out.print("Enter choice:");
	  	ch=sc.nextInt();
	  	if(ch==1)
		{
		 if(top==n-1)
		  System.out.println("Stack overflow");
		else{
		  System.out.print("Enter element:");
		  push=sc.nextInt();
		  stack[++top]=push;
			}
		}
		else if(ch==2)
		{
		 if(top==-1)
		  System.out.println("Stack underflow");
		 else{
		 	System.out.println("Popped element is "+stack[top]+"\n");
		 	top--;
		 	 }
		}
		 else if(ch==3){
		 if(top==-1)
		  System.out.println("Stack is empty");
		 else
		  System.out.println("Top element is "+stack[top]+"\n");}
		 else if(ch==4){
		 	if(top==-1)
		  		System.out.println("Stack is empty");
		  	else{
		  		System.out.println("Stack elements:");
		  		for(i=top;i>=0;i--)
		  			System.out.println(+stack[i]);}
			  }
		else if(ch==5)
		 System.out.print("End");
		else
		 System.out.print("Invalid choice!\n");
	  
			}
		}
	}
	