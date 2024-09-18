class shape{
    public int get_area()
    {
        int a=0;
        return a;
    }
}
class rectangle extends shape{
    
    public int get_area(int l,int b)
    {
        int a;
        a=l*b;
        return a;
    }
}
class box extends rectangle{
    
    public int get_area(int h,int w,int l)
    {
        int surface_area;
        surface_area=2*((l*w)+(h*w)+(h*l));
        return surface_area;
    }
    
}
public class inherit{
    public static void main(String[] args)
    {
        shape s=new shape();
        rectangle r=new rectangle();
        box b=new box();
        System.out.println("Area of shape:"+s.get_area());
        System.out.println("Area of rectangle:"+r.get_area(1,2));
        System.out.println("Surface Area of box:"+b.get_area(1,2,3));
     
    }
}