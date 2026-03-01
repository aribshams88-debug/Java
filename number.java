class number
{
    int a,b;
    void add()
    {
        int sum = a+b;
        System.out.println("Sum is :"+sum);
    }
    public static void main(String args[])
    {
        number ob=new number();
        ob.a=20;
        ob.b=63;
        ob.add();
    }
}
