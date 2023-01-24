import java.io.*;
import java.util.*;
public class FileHandling{
   public static void main(String args[])throws IOException{
      int ch=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter file name:");
      String fn=sc.nextLine();
   
      File f=new File(fn);
      if(f.createNewFile())
         System.out.println("file created path is"+f.getAbsolutePath());
      else
         System.out.println("File Already Exists");
      System.out.println("Choice:\n1.Read\n2.Write\n3.Append\n4.Exit");
      while(ch!=4){
          System.out.print("Enter choice:");
          ch=sc.nextInt();
          if(ch==1){
              Scanner scan=new Scanner(f);
              while(scan.hasNextLine())
                   System.out.println(scan.nextLine());
          }
          else if(ch==2){
               sc.nextLine();
               try{
                 FileWriter fw=new FileWriter(f);
                 System.out.print("Enter the text:");
                 String str=sc.nextLine();
                 fw.write(str);
                 fw.close();
                }
                catch(Exception e){}
          }
          else if(ch==3){
                sc.nextLine();
                try{
                    FileWriter fa=new FileWriter(f,true);
                    System.out.print("Enter the text:");
                    String str=sc.nextLine();
                    fa.write(str);
                    fa.close();
                }
                catch(Exception e){}
          }
     }
}
}


        