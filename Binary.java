import java.util.*;
import java.util.Scanner;
public class Binary {
    void swap(int []a,int x,int y)
    {
        int t=a[x];
        a[x]=a[y];
        a[y]=t;
    }
    int[] sort(int a[])
    {
        for(int i=0;i<5;i++){
            int min=i;
            for(int j=i;j<5;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
                swap(a,min,i);
            
        }
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        return a;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a=new int[10];
        int i;
        for(i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        Binary b=new Binary();
        a=b.sort(a);
        System.out.println("Enter the element to be searched :");
        int ele=sc.nextInt();
        int l=0;
        int r=4;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==ele){
                System.out.println("found"+m);
                break;
            }
            else if(a[m]>ele){
                r=m-1;
            }
            else if(a[m]<ele){
                l=m+1;
            }
            else{
                System.out.println("Element not found");
            }
        }
    }
}   