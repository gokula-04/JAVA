import java.util.*;
public class Error{
    public static void main(String[] args){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two elements");
        a=sc.nextInt();
        b=sc.nextInt();
        try {
            c=a/b;
            throw new MyException(c);
        } catch (ArithmaticException e) {
            System.out.prinln(e);
        }
    }
}
class MyException extends Exception{
MyException(int x){
    if(x%2==0)
    System.out.println("Even Error");
    else
    System.out.println(+x);
}
}