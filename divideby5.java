public class divideby5 {
    int n;
    void display()
    {
        if(n%5==0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not Divisible by  5! ");
    }
    public static void main(String arg[])
    {
        divideby5 ob = new divideby5();
        ob.n=25;
        ob.display();
    }
    
}
