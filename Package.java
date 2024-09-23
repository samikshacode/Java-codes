import Package.trig;
import Package.arith;
import Package.stat;
import java.util.Scanner;
public class Package {
    public static void main(String[] args) {
        // Trigonometric operations
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Degrees :");
        int a=sc.nextInt();
        if(a<0 && a>360)
        {
            System.out.println("\nInvalid Angle.");
            return;
        }
        trig trig = new trig(a); 
        System.out.println("\nSine: " + trig.getsine());
        System.out.println("Cosine: " + trig.getcosine());
        System.out.println("Tangent: " + trig.gettan());
        
        // Arithmetic operations
        System.out.print("Enter 1st number : ");
        int b=sc.nextInt();
        System.out.print("\nEnter 2nd number : ");
        int c=sc.nextInt();
        arith arithmetic = new arith();
        System.out.println("\nAddition: " + arithmetic.add(b,c));
        System.out.println("Subtraction: " + arithmetic.subtract(b,c));
        System.out.println("Multiplication: " + arithmetic.multiply(b,c));
        System.out.println("Division: " + arithmetic.divide(b,c));

        // Statistical operations
        System.out.print("Enter Array Size : ");
        int d=sc.nextInt();
        int[] numbers = new int[d];
        System.out.print("\nEnter Array : ");
        for(int i=0;i<d;i++)
        {
            numbers[i]=sc.nextInt();
        }
        stat stat = new stat();
        System.out.println("Minimum: " + stat.min(numbers));
        System.out.println("Maximum: " + stat.max(numbers));
        System.out.println("Count: " + stat.count(numbers));
        System.out.println("Sum: " + stat.sum(numbers));
        System.out.println("Average: " + stat.average(numbers));
    }
}