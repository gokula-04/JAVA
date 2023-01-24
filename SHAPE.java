import java.util.*;
abstract class Shape {
    int a,b;
	abstract void printArea(double a,double b);
}
class Circle extends Shape{
	void printArea(double a,double b){
		System.out.println("Area of Circle:"+(a*a));
	}
}
class Rectangle extends Shape{
	void printArea(double a,double b){
		System.out.println("Area of rectangle:"+(a*b));
	}
}
class Triangle extends Shape{
	void printArea(double a,double b){
		System.out.println("Area of triangle:"+(0.5*a*b));
	}
}
class test {
	public static void main(String[] args) {int ch=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("MENU\n1.Circle 2.Rectangle 3.Triangle 4.Exit");
	    while(ch!=4){
	        System.out.print("Enter choice:");
	        ch = sc.nextInt();
	        if(ch==1){
	            Shape s=new Circle();
	            System.out.print("Enter radius:");
	            double r=sc.nextDouble();
		        s.printArea(r,r);
	        }
	        else if(ch==2){
	            Shape s=new Rectangle();
	            System.out.print("Enter length and breadth:");
	            double l=sc.nextDouble();
	            double b=sc.nextDouble();
		        s.printArea(l,b);
	    }
	        else if(ch==3){
	            Shape s=new Triangle();
	            System.out.print("Enter base and height:");
	            double b=sc.nextDouble();
	            double h=sc.nextDouble();
		        s.printArea(b,h);
	    }
		
}}}
