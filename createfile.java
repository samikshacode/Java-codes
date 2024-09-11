import java.io.*;
import java.util.Scanner;
class createfile{
    public static void main(String[] args)
    {
        File f= new File("D:\\22UAI035\\samiksha.txt");
        try{
            if(f.createNewFile())
            {

                System.out.println("File is created successfully.");
            }
            else
            {
                System.out.println("File already exists.");
            }
        }
        catch(IOException i)
        {
            System.out.println("Exception handled!");
        }
        try( FileWriter w = new FileWriter(f))
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter data to be write in the file:");
            String s = sc.nextLine();
            w.write(s);
            System.out.println("Successfully written.");
        }
        catch(IOException i)
        {
            System.out.println("Can't write into file.");
        }
        try(BufferedReader r= new BufferedReader(new FileReader(f)))
        {
           String l=r.readLine();
            System.out.println("File read successfully");
            System.out.println(l);
        }
        catch(IOException i)
        {
            System.out.println("Can't read!");
        }
        f.delete();
        try
        {
            if(f.exists())
            {
              System.out.println("Could not delete.");
            }
            else
            {
                System.out.println("File deleted successfully.");
            }
        }
        catch(Exception i)
        {
            System.out.println("Exception got handled.");
        }
    
    }
}