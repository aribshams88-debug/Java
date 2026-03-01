public class rectangle {
    double length;
    double width;
    void calculate()
    {
        double area = 0;
        area=length+width;
        double perimeter =0;
        perimeter= 2*(length+width);
        System.out.println("Area is :"+area);
        System.out.println("Perimeter is "+perimeter);

    }
    public static void main(String arg[])
    {
        rectangle ob=new rectangle();
        ob.length=11;
        ob.width=15;
        ob.calculate();
    }
    
    
}
