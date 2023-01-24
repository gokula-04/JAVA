import java.util.*;
import java.util.Scanner;
public class sequential{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []a=new int[10];
        int i;
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();      
        }
        System.out.println("Enter the el to se");
        int ele=sc.nextInt();
        int flag=1;
        for(i=0;i<5;i++)
        {
            if(a[i]==ele)
            System.out.println(i);
        }
        if(flag==0)
        System.out.println("Not found");

    }
}
