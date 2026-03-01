public class oddeven {
    int n;
    void check()
    {
        if(n%2==0)
            System.out.println("Even "+n);
        else
            System.out.println("Odd "+n);
        
    }
    public static void main(String arg[])
    {
        oddeven ob = new oddeven();
        ob.n=7;
        ob.check();
    }
    
}
