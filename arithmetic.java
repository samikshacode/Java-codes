import java.util.Scanner;
public class arithmetic{

    public static void main(String[] args)
    {
        System.out.println("Program is started.");
        Scanner sc = new Scanner(System.in);
        int a=12;
        int b=0;
        int c;
        int dividend[]=new int[5];
        int divisor;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("cannot be divided");
        }
        System.out.println("Program is ended.");
        System.out.println("Enter the dividend:");
        for(int i=0;i<5;i++)
        {
           dividend[i]=sc.nextInt();
        }
        System.out.println("Enter the divisor:");
        divisor=sc.nextInt();
        
        try{
            for(int i=0;i<5;i++)
            {
              if(divisor==0)
              {
                System.out.println("cannot be divided by zero.");
              }
              else{
              c=dividend[i]/divisor;
              System.out.println(c);
              }
            } 
         
        }
        catch(Exception e)
        {
            System.out.println("error occured.");
        }
        
      sc.close();
    }

}