import java.util.*;
import java.io.*;
class files{
    public static void main(String[] args) throws IOException{
        int ch=0;
        Scanner sc = new Scanner(System.in);
        File f = new File("sample.txt");
        if(f.createNewFile())
            System.out.print("Created at"+f.getAbsolutePath());
        else
            System.out.print("Already Created");
        System.out.print("MENU\n1.Read 2.Write 3.Delete 4.Append 5.Exit\n");
        while(ch!=5){
            System.out.print("Enter choice:");
            ch=sc.nextInt();
            if(ch==1){
                Scanner s = new Scanner(f);
                while(s.hasNextLine())
                    System.out.print(s.nextLine());
            }
            else if(ch==2){
                sc.nextLine();
                try{
                FileWriter fw = new FileWriter(f);
                System.out.print("Enter text:");
                String str = sc.nextLine();
                fw.write(str);
                fw.close();
            }
            catch(Exception e){}
        }
        else if(ch==3){
            if(f.delete())
                System.out.print("Deleted");
            else
                System.out.print("Failed");
        }
        else if(ch==4){
                sc.nextLine();
                try{
                FileWriter fw = new FileWriter(f,true);
                System.out.print("Enter text:");
                String str = sc.nextLine();
                fw.write(str);
                fw.close();
            }
            catch(Exception e){}
        }
}}}