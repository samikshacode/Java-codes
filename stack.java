import java.util.Scanner;

class stk{
    
int st[];
int top=-1;
int capacity;
public stk(int size)
     
{
        capacity=size;
      st=new int[capacity];
        top =-1;
    }
    public void get_stack(int ele)
    {

       if(top==capacity-1)
       {
         System.out.println("Overflow!");
       }
       else
       {
         top=top+1;
         st[top]=ele;
       }
       System.out.println(ele);
    }
    public void pop_duplicate()
    {
        for(int i=0;i<capacity;i++)
        {
            for(int j=i+1;j<capacity;j++)
            {
                if(st[i]==st[j])
                {
                    i++;
                    j++;
                }
                else{

                }
            }
           System.out.println(st[i]);
        }
    }
}

public class stack{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of stack:");
        int sz=sc.nextInt();
        stk s=new stk(sz);
        System.out.println("Stack:");
        s.get_stack(1);
        s.get_stack(12);
        s.get_stack(13);
        s.get_stack(13);
        System.out.println("Stack after removing duplicate:");
        s.pop_duplicate();

    }
}