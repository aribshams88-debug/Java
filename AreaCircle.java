class Point{
    int x,y;
    Point(int a,int b){
        x =a;
        y=b;
    }
}
class Circle{
    Point p;
    double r;
    Circle(int x, int y, double radius)
    {
        p= new Point(x,y);
        r= radius;
    }
    void display()
    {
        double area =3.14*r*r;
        System.out.println("Point : ("+p.x+","+p.y+")");
        System.out.println("Radius "+r);
        System.out.println("Area :"+area);
    }
}
public class AreaCircle{
    public static void main(String[] args){
        Circle ob = new Circle(2, 3, 4);
        ob.display();
    }
}
