import java.util.*;
class queue{
    public static void main(String[] args) {
        int n,front=-1,rear=-1,i,ch=0,e;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter queue size:");
        n=sc.nextInt();
        int[] queue=new int[n];
        System.out.println("MENU\n1.Enqueue 2.Dequeue 3.Peek 4.Display 5.Exit\n");
	  while(ch!=5){
	  	System.out.print("Enter choice:");
	  	ch=sc.nextInt();
	  	if(ch==1){
		 if(rear==n-1)
		  System.out.println("Queue Overflow\n");
		 else if(front==-1 && rear==-1){
		 	System.out.print("Enter element:");
		 	e=sc.nextInt();
		 	front=rear=0;
		 	queue[rear]=e;
		 }
		 else{
		  System.out.print("Enter element:");
		  e=sc.nextInt();
		  queue[++rear]=e;
		}}
		else if(ch==2){
		 if(front==-1 && rear==-1)
		  System.out.println("Queue Underflow");
		 else if(front==rear){
		 	System.out.println("Removed element:"+queue[front]+"\n");
		 	front=rear=-1;}
		 else{
		 	System.out.println("Removed element:"+queue[front++]+"\n");
		 }}
		 else if(ch==3){
		 if(front==-1 && rear==-1)
		  System.out.print("Queue Underflow\n");
		 else
		   System.out.println("Peek element:"+queue[front]);}
		 else if(ch==4){
		     if(front==-1 && rear==-1)
		        System.out.print("Queue Underflow\n");
		     else{
		            for(i=front;i<rear+1;i++)
		            System.out.println(queue[i]);}}
		else if(ch==5)
		 System.out.print("End");
		else
		 System.out.print("Invalid choice!\n");
	  
    }}}